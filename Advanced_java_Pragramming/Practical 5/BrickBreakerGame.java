import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BrickBreakerGame extends JPanel implements ActionListener, KeyListener {
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    private static final int PADDLE_WIDTH = 100;
    private static final int PADDLE_HEIGHT = 10;
    private static final int BALL_SIZE = 20;
    private static final int BRICK_WIDTH = 80;
    private static final int BRICK_HEIGHT = 20;
    private static final int BRICK_ROWS = 5;
    private static final int BRICK_COLS = 10;
    private static final int DELAY = 10;

    private int paddleX;
    private int ballX, ballY, ballVelX, ballVelY;
    private boolean[] bricks;
    private boolean gameRunning = true;

    public BrickBreakerGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        Timer timer = new Timer(DELAY, this);
        timer.start();

        initializeGame();
    }

    private void initializeGame() {
        paddleX = WIDTH / 2 - PADDLE_WIDTH / 2;
        ballX = WIDTH / 2 - BALL_SIZE / 2;
        ballY = HEIGHT - PADDLE_HEIGHT - BALL_SIZE;
        ballVelX = 2;
        ballVelY = -2;

        bricks = new boolean[BRICK_ROWS * BRICK_COLS];
        for (int i = 0; i < bricks.length; i++) {
            bricks[i] = true;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw paddle
        g.setColor(Color.WHITE);
        g.fillRect(paddleX, HEIGHT - PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

        // Draw bricks
        int brickWidthWithGap = BRICK_WIDTH + 2;
        int brickHeightWithGap = BRICK_HEIGHT + 2;
        g.setColor(Color.GREEN);
        for (int row = 0; row < BRICK_ROWS; row++) {
            for (int col = 0; col < BRICK_COLS; col++) {
                int index = row * BRICK_COLS + col;
                if (bricks[index]) {
                    int brickX = col * brickWidthWithGap + 30;
                    int brickY = row * brickHeightWithGap + 50;
                    g.fillRect(brickX, brickY, BRICK_WIDTH, BRICK_HEIGHT);
                }
            }
        }

        if (!gameRunning) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("Game Over", WIDTH / 2 - 100, HEIGHT / 2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameRunning) {
            moveBall();
            checkCollision();
            repaint();
        }
    }

    private void moveBall() {
        ballX += ballVelX;
        ballY += ballVelY;

        if (ballX <= 0 || ballX >= WIDTH - BALL_SIZE) {
            ballVelX = -ballVelX;
        }

        if (ballY <= 0) {
            ballVelY = -ballVelY;
        }

        if (ballY >= HEIGHT) {
            gameRunning = false;
        }
    }

    private void checkCollision() {
        Rectangle ballRect = new Rectangle(ballX, ballY, BALL_SIZE, BALL_SIZE);
        Rectangle paddleRect = new Rectangle(paddleX, HEIGHT - PADDLE_HEIGHT, PADDLE_WIDTH, PADDLE_HEIGHT);

        if (ballRect.intersects(paddleRect)) {
            ballVelY = -ballVelY;
        }

        int brickWidthWithGap = BRICK_WIDTH + 2;
        int brickHeightWithGap = BRICK_HEIGHT + 2;
        for (int row = 0; row < BRICK_ROWS; row++) {
            for (int col = 0; col < BRICK_COLS; col++) {
                int index = row * BRICK_COLS + col;
                if (bricks[index]) {
                    int brickX = col * brickWidthWithGap + 30;
                    int brickY = row * brickHeightWithGap + 50;
                    Rectangle brickRect = new Rectangle(brickX, brickY, BRICK_WIDTH, BRICK_HEIGHT);

                    if (ballRect.intersects(brickRect)) {
                        bricks[index] = false;
                        ballVelY = -ballVelY;
                    }
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            if (paddleX > 0) {
                paddleX -= 20;
            }
        }

        if (key == KeyEvent.VK_RIGHT) {
            if (paddleX < WIDTH - PADDLE_WIDTH) {
                paddleX += 20;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Brick Breaker Game");
        BrickBreakerGame game = new BrickBreakerGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
