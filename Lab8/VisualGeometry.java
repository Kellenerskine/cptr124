package Lab8;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;

/**
 * An interactive visual application that allows the user to explore geometric
 * lines
 */
public class VisualGeometry {

    @SuppressWarnings("serial")
    private static class GraphicalPanel extends JPanel {
        protected static final int NORMAL_OFFSET = 4;
        protected static final int ACTIVE_OFFSET = 8;
        protected static final int NORMAL_SIZE = 8;
        protected static final int ACTIVE_SIZE = 16;
        protected static final int CLOSENESS = 8;
        protected static final Color LIGHT_GRAY = new Color(220, 220, 220);
        protected static final Color DARK_GREEN = new Color(0, 150, 0);
        protected static final Color DARK_BLUE = new Color(0, 0, 200);
        protected Point point1 = null;
        protected Point point2 = null;
        protected Point point3 = null;
        protected Point point4 = null;
        protected Point intersectionPoint = null;
        protected Point activePoint = null;
        protected boolean isDragging = false;

        protected Dimension dimension;

        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (activePoint != null) {
                    isDragging = true;
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int x = e.getX() - getWidth() / 2,
                    y = getHeight() / 2 - e.getY();
                if (point1 == null) {
                    point1 = new Point(x, y);
                } else if (point2 == null) {
                    point2 = new Point(x, y);
                } else if (point3 == null) {
                    point3 = new Point(x, y);
                } else if (point4 == null) {
                    point4 = new Point(x, y);
                }
                isDragging = false;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                if (!isDragging) {
                    checkActive(e.getX() - getWidth() / 2, getHeight() / 2 - e.getY());
                }
                repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (isDragging && activePoint != null) {
                    activePoint.x = e.getX() - getWidth() / 2;
                    activePoint.y = getHeight() / 2 - e.getY();
                }
                repaint();
            }
        };

        public GraphicalPanel(int width, int height) {
            setBackground(Color.WHITE);
            setLayout(null);
            addMouseListener(mouseAdapter);
            addMouseMotionListener(mouseAdapter);
            setFocusable(true);
            dimension = new Dimension(width, height);
            addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    super.keyTyped(e);
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_UP:
                            System.out.println("You pressed the UP key");
                            break;
                        case KeyEvent.VK_DOWN:
                            System.out.println("You pressed the DOWN key");
                            break;
                        case KeyEvent.VK_ESCAPE:
                            point1 = point2 = point3 = point4 = activePoint = null;
                            break;
                        case KeyEvent.VK_V:
                            if (point1 != null && point2 == null) {
                                point2 = new Point(point1.x, getHeight() / 2);
                            } else if (point3 != null && point4 == null) {
                                point4 = new Point(point3.x, getHeight() / 2);
                            }
                            break;
                        case KeyEvent.VK_H:
                            if (point1 != null && point2 == null) {
                                point2 = new Point(getWidth() / 2, point1.y);
                            } else if (point3 != null && point4 == null) {
                                point4 = new Point(getWidth() / 2, point3.y);
                            }
                            break;
                    }
                    repaint();
                }
            });
        }

        protected void checkActive(int x, int y) {
            if (point1 != null && near(point1, x, y)) {
                activePoint = point1;
            } else if (point2 != null && near(point2, x, y)) {
                activePoint = point2;
            } else if (point3 != null && near(point3, x, y)) {
                activePoint = point3;
            } else if (point4 != null && near(point4, x, y)) {
                activePoint = point4;
            } else {
                activePoint = null;
            }
        }

        private boolean near(Point p, double x, double y) {
            double dx = p.x - x, dy = p.y - y;
            dx = (dx > 0) ? dx : -dx;
            dy = (dy > 0) ? dy : -dy;
            return dx < CLOSENESS && dy < CLOSENESS;
        }

        protected void drawPoint(Graphics2D g, Point p) {
            int x = (int) Math.round(p.x), y = (int) Math.round(p.y);
            g.fillOval(x - NORMAL_OFFSET, y - NORMAL_OFFSET, NORMAL_SIZE, NORMAL_SIZE);
            if (p == activePoint) {
                g.drawOval(x - ACTIVE_OFFSET, y - ACTIVE_OFFSET, ACTIVE_SIZE, ACTIVE_SIZE);
            }
            g.scale(1, -1);
            g.drawString(p.toString(), x + 10, -y - 10);
            g.scale(1, -1);

        }

        protected void drawExtendedLine(Graphics2D g2, Line userLine) {
            double m = userLine.slope(), new_x1, new_y1, new_x2, new_y2;
            if (m == Double.POSITIVE_INFINITY) {
                new_x1 = new_x2 = userLine.intercept();
                new_y1 = -getHeight() / 2;
                new_y2 = getHeight() / 2;
            } else if (m >= -1.0 && m <= 1.0) {
                Point i1 = userLine.intersection(new Line(Double.POSITIVE_INFINITY, -getWidth() / 2)),
                      i2 = userLine.intersection(new Line(Double.POSITIVE_INFINITY, getWidth() / 2));
                new_x1 = i1.x;
                new_y1 = i1.y;
                new_x2 = i2.x;
                new_y2 = i2.y;
            } else {
                Point i1 = userLine.intersection(new Line(0, -getHeight() / 2)),
                      i2 = userLine.intersection(new Line(0, getHeight() / 2));
                new_x1 = i1.x;
                new_y1 = i1.y;
                new_x2 = i2.x;
                new_y2 = i2.y;
            }
            var strokeSaved = g2.getStroke();
            g2.setStroke(new BasicStroke(2));
            g2.drawLine((int) Math.round(new_x1), (int) Math.round(new_y1), 
                        (int) Math.round(new_x2), (int) Math.round(new_y2));
            g2.setStroke(strokeSaved);
        }

        private void drawGrid(Graphics2D g, int interval) {
            int w = getWidth(), h = getHeight(), maxX = w / 2, maxY = h / 2;
            g.setColor(LIGHT_GRAY);
            // Draw the minor grid lines
            for (int i = 0; i < w / 2; i += interval) {
                g.drawLine(-maxX, i, maxX, i);
                g.drawLine(-maxX, -i, maxX, -i);
                g.drawLine(i, -maxY, i, maxY);
                g.drawLine(-i, -maxY, -i, maxY);

            }
            // Draw the axes
            g.setColor(Color.BLACK);
            var strokeSaved = g.getStroke();
            g.setStroke(new BasicStroke(2));
            g.drawLine(-maxX, 0, maxX, 0);
            g.drawLine(0, -maxY, 0, maxY);

            // Draw the x-axis arrow heads
            g.drawLine(-maxX, 0, -maxX + 10, -7);
            g.drawLine(-maxX, 0, -maxX + 10, 7);
            g.drawLine(maxX, 0, maxX - 10, -7);
            g.drawLine(maxX, 0, maxX - 10, 7);

            // Draw the y-axis arrow heads
            g.drawLine(0, -maxY, -7, -maxY + 10);
            g.drawLine(0, -maxY, 7, -maxY + 10);
            g.drawLine(0, maxY, -7, maxY - 10);
            g.drawLine(0, maxY, 7, maxY - 10);

            g.setStroke(strokeSaved);
        }

        @Override
        public Dimension getPreferredSize() {
            return dimension;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            AffineTransform at = g2.getTransform();
            g2.translate(getWidth() / 2, getHeight() / 2);
            g2.scale(1, -1); // Invert y-axis
            drawGrid(g2, 20);
            Line line1 = null, line2 = null;
            if (point1 != null) {
                g.setColor(DARK_BLUE);
                drawPoint(g2, point1);
                if (point2 != null) {
                    drawPoint(g2, point2);
                    line1 = new Line(point1, point2);
                    drawExtendedLine(g2, line1);
                    if (point3 != null) {
                        g.setColor(DARK_GREEN);
                        drawPoint(g2, point3);
                        if (point4 != null) {
                            drawPoint(g2, point4);
                            line2 = new Line(point3, point4);
                            drawExtendedLine(g2, line2);
                            intersectionPoint = line1.intersection(line2);
                            if (intersectionPoint != null) {
                                g.setColor(Color.RED);
                                drawPoint(g2, intersectionPoint);
                            }
                        }
                    }
                }
            }
            g2.scale(1, -1); // Re-invert the y-axis to print the text right-side up
            if (line1 != null) {
                g.setColor(DARK_BLUE);
                int x = -getWidth() / 2;
                g.drawString(line1.toString(), x + 10, -x - 40);
                if (line2 != null) {
                    g.setColor(DARK_GREEN);
                    g.drawString(line2.toString(), x + 10, -x - 20);
                }
            }
            g2.setTransform(at);
        }

    }

    /**
     * A convenience superclass for creating simple graphical applications.
     */
    @SuppressWarnings("serial")
    private static class ApplicationWindow extends JFrame {
        /**
         * Creates a new application window. The client provides application-specific
         * information.
         * 
         * @param title  the title of the window; appears in the window's title bar
         * @param x      the <i>x</i> coordinate of the window's top-left corner
         * @param y      the <i>y</i> coordinate of the window's top-left corner
         * @param width  the window's width
         * @param height the window's height
         * @param panel  the application's drawing area and application-specific
         *               functionality
         */
        public ApplicationWindow(String title, int x, int y, JComponent panel) {
            super(title);
            setLocation(x, y);
            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            pack();
            setVisible(true);
        }
    }

    /**
     * Starting point of the application's execution
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ApplicationWindow("Visual Geometry", 100, 100, new GraphicalPanel(600, 600));
        });
    }
}