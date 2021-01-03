package battleShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

class GamePanel extends JPanel implements ActionListener {

  // ********* Global Variables
  private static final int SCREEN_WIDTH = 1200;
  private static final int SCREEN_HEIGHT = 640;
  private static final int UNIT_SIZE = 20;
  private static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
  private static final int DELAY = 200;
  private static boolean running = false;
  private static final Random r = new Random();
  private final Timer timer = new Timer(DELAY, this);
  // ********* END of Global Variables

  GamePanel() {
    this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    this.setBackground(Color.gray);
    this.setFocusable(true);
    this.addKeyListener(new GamePanel.MyKeyAdapter());
    startGame();
  }

  public void startGame() {
    running = true;
    timer.start();
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    draw(g);
  }

  public void draw(Graphics g) {
    if (running) {
      g.setColor(Color.blue);
      g.fillRect(20, 20, 600, 600);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    repaint();
  }

  private static class MyKeyAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {

    }
  }
}
