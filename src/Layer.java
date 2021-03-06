import java.awt.Color;
import java.awt.Graphics;

public class Layer implements Colorable, Styleable {
    private Banner.Style style;
    private Color color;

    public Layer(Banner.Style style, Color color) {
        this.style = style;
        this.color = color;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);

        int i;
        int j;

        switch (style) {
            case BLANK:
                break;
            case UPPER_LEFT_SQUARE:
                g.fillRect(x, y, 90, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 90, 10);
                g.fillRect(x, y + 10, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 90, y, 10, 130);
                g.fillRect(x, y + 130, 100, 10);
                break;
            case UPPER_RIGHT_SQUARE:
                g.fillRect(x + 110, y, 90, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x + 110, y, 90, 10);
                g.fillRect(x + 190, y + 10, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 100, y, 10, 130);
                g.fillRect(x + 100, y + 130, 100, 10);
                break;
            case LOWER_LEFT_SQUARE:
                g.fillRect(x, y + 270, 90, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x, y + 390, 90, 10);
                g.fillRect(x, y + 270, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 90, y + 270, 10, 130);
                g.fillRect(x, y + 260, 100, 10);
                break;
            case LOWER_RIGHT_SQUARE:
                g.fillRect(x + 110, y + 270, 90, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x + 110, y + 390, 90, 10);
                g.fillRect(x + 190, y + 270, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 100, y + 270, 10, 130);
                g.fillRect(x + 100, y + 260, 100, 10);
                break;
            case BOTTOM_STRIPE:
                g.fillRect(x, y + 270, 200, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x, y + 390, 200, 10);
                g.fillRect(x, y + 270, 10, 120);
                g.fillRect(x + 190, y + 270, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 260, 200, 10);
                break;
            case TOP_STRIPE:
                g.fillRect(x, y, 200, 130);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 200, 10);
                g.fillRect(x, y + 10, 10, 120);
                g.fillRect(x + 190, y + 10, 10, 120);
                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 130, 200, 10);
                break;
            case LEFT_STRIPE:
                g.fillRect(x, y, 60, 400);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 10, 400);
                g.fillRect(x + 10, y, 50, 10);
                g.fillRect(x + 10, y + 390, 50, 10);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 60, y, 10, 400);
                break;
            case RIGHT_STRIPE:
                g.fillRect(x + 140, y, 60, 400);
                g.setColor(Banner.MASK);
                g.fillRect(x + 190, y, 10, 400);
                g.fillRect(x + 140, y, 50, 10);
                g.fillRect(x + 140, y + 390, 50, 10);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 130, y, 10, 400);
                break;
            case CENTER_STRIPE:
                g.fillRect(x + 80, y, 40, 400);
                g.setColor(Banner.MASK);
                g.fillRect(x + 80, y, 40, 10);
                g.fillRect(x + 80, y + 390, 40, 10);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 70, y, 10, 400);
                g.fillRect(x + 120, y, 10, 400);
                break;
            case MIDDLE_STRIPE:
                g.fillRect(x, y + 180, 200, 40);
                g.setColor(Banner.MASK);
                g.fillRect(x, y + 180, 10, 40);
                g.fillRect(x + 190, y + 180, 10, 40);
                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 170, 200, 10);
                g.fillRect(x, y + 220, 200, 10);
                break;
            case DOWN_RIGHT_DIAGONAL:
                for (i = 0; i < 18; i++)
                    g.fillRect(x + 10 * i, y + 20 * i, 30, 60);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 10, 60);
                g.fillRect(x + 10, y, 20, 10);
                g.fillRect(x + 190, y + 340, 10, 50);
                g.fillRect(x + 170, y + 390, 30, 10);
                g.setColor(getMaskColor(color));
                for (i = 0; i < 17; i++) {
                    g.fillRect(x + 10 * i, y + 60 + 20 * i, 10, 20);
                    g.fillRect(x + 30 + 10 * i, y + 20 * i, 10, 20);
                }
                break;
            case DOWN_LEFT_DIAGONAL:
                for (i = 0; i < 18; i++)
                    g.fillRect(x + 170 - 10 * i, y + 20 * i, 30, 60);
                g.setColor(Banner.MASK);
                g.fillRect(x + 190, y, 10, 60);
                g.fillRect(x + 170, y, 20, 10);
                g.fillRect(x, y + 340, 10, 50);
                g.fillRect(x, y + 390, 30, 10);
                g.setColor(getMaskColor(color));
                for (i = 0; i < 17; i++) {
                    g.fillRect(x + 190 - 10 * i, y + 60 + 20 * i, 10, 20);
                    g.fillRect(x + 160 - 10 * i, y + 20 * i, 10, 20);
                }
                break;
            case SMALL_STRIPES:
                for (i = 0; i < 4; i++) {
                    g.setColor(color);
                    g.fillRect(x + 20 + 50 * i, y, 10, 400);
                    g.setColor(Banner.MASK);
                    g.fillRect(x + 20 + 50 * i, y, 10, 10);
                    g.fillRect(x + 20 + 50 * i, y + 390, 10, 10);
                    g.setColor(getMaskColor(color));
                    g.fillRect(x + 10 + 50 * i, y, 10, 400);
                    g.fillRect(x + 30 + 50 * i, y, 10, 400);
                }
                break;
            case CROSS:
                j = 0;
                for (i = 0; i < 19; i++) {
                    j = 180 - Math.abs(180 - 20 * i);
                    g.fillRect(x + 10 * i, y + j, 20, 40);
                    g.fillRect(x + 10 * i, y + 360 - j, 20, 40);
                }
                g.fillRect(x + 80, y + 180, 40, 60);
                g.setColor(getMaskColor(color));

                j = 0;
                for (i = 0; i < 16; i++) {
                    j = 150 - Math.abs(150 - 20 * i);
                    g.fillRect(x + 20 + 10 * i, y + j, 10, 20);
                    g.fillRect(x + 20 + 10 * i, y + 380 - j, 10, 20);
                }

                j = 0;
                for (i = 0; i < 16; i++) {
                    j = 75 - Math.abs(75 - 10 * i);
                    g.fillRect(x + j, y + 40 + 20 * i, 10, 20);
                    g.fillRect(x + 190 - j, y + 40 + 20 * i, 10, 20);
                }

                g.setColor(Banner.MASK);

                g.fillRect(x, y, 20, 10);
                g.fillRect(x, y + 10, 10, 30);
                g.fillRect(x, y + 360, 10, 30);
                g.fillRect(x, y + 390, 20, 10);
                g.fillRect(x + 180, y, 20, 10);
                g.fillRect(x + 190, y + 10, 10, 30);
                g.fillRect(x + 180, y + 390, 20, 10);
                g.fillRect(x + 190, y + 360, 10, 30);
                break;
            case STRAIGHT_CROSS:
                g.setColor(getMaskColor(color));
                g.fillRect(x + 80, y, 40, 400);
                g.fillRect(x, y + 180, 80, 40);
                g.fillRect(x + 120, y + 180, 80, 40);

                g.setColor(color);
                g.fillRect(x + 90, y, 20, 400);
                g.fillRect(x, y + 190, 200, 20);

                g.setColor(Banner.MASK);
                g.fillRect(x, y + 190, 10, 20);
                g.fillRect(x + 90, y, 20, 10);
                g.fillRect(x + 190, y + 190, 10, 20);
                g.fillRect(x + 90, y + 390, 20, 10);
                break;
            case BORDER:
                g.fillRect(x, y, 200, 20);
                g.fillRect(x, y + 380, 200, 20);
                g.fillRect(x, y + 20, 20, 360);
                g.fillRect(x + 180, y + 20, 20, 360);

                g.setColor(getMaskColor(color));
                g.fillRect(x + 20, y + 20, 160, 10);
                g.fillRect(x + 20, y + 370, 160, 10);
                g.fillRect(x + 20, y + 30, 10, 340);
                g.fillRect(x + 170, y + 30, 10, 340);

                g.setColor(Banner.MASK);
                g.fillRect(x, y, 200, 10);
                g.fillRect(x, y + 390, 200, 10);
                g.fillRect(x, y + 10, 10, 380);
                g.fillRect(x + 190, y + 10, 10, 380);
                break;
            case CURLY_BORDER:
                g.setColor(getMaskColor(color));
                g.fillRect(x, y, 200, 10);
                g.fillRect(x, y, 10, 400);
                g.fillRect(x + 190, y, 10, 400);
                g.fillRect(x, y + 390, 200, 10);


                g.fillRect(x, y, 20, 90);
                g.fillRect(x, y, 40, 70);
                g.fillRect(x, y, 50, 60);
                g.fillRect(x + 50, y, 10, 50);
                g.fillRect(x, y, 70, 40);
                g.fillRect(x, y, 90, 20);

                g.setColor(color);
                g.fillRect(x, y, 10, 90);
                g.fillRect(x, y, 20, 70);
                g.fillRect(x, y, 40, 60);
                g.fillRect(x, y, 60, 40);
                g.fillRect(x, y, 70, 20);
                g.fillRect(x, y, 90, 10);


                g.setColor(getMaskColor(color));
                g.fillRect(x + 180, y, 20, 90);
                g.fillRect(x + 160, y, 40, 70);
                g.fillRect(x + 150, y, 50, 60);
                g.fillRect(x + 140, y, 10, 50);
                g.fillRect(x + 130, y, 70, 40);
                g.fillRect(x + 110, y, 90, 20);

                g.setColor(color);
                g.fillRect(x + 190, y, 10, 90);
                g.fillRect(x + 180, y, 20, 70);
                g.fillRect(x + 160, y, 40, 60);
                g.fillRect(x + 140, y, 60, 40);
                g.fillRect(x + 130, y, 70, 20);
                g.fillRect(x + 110, y, 90, 10);


                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 310, 20, 90);
                g.fillRect(x, y + 330, 40, 70);
                g.fillRect(x, y + 340, 50, 60);
                g.fillRect(x + 50, y + 350, 10, 50);
                g.fillRect(x, y + 360, 70, 40);
                g.fillRect(x, y + 380, 90, 20);

                g.setColor(color);
                g.fillRect(x, y + 310, 10, 90);
                g.fillRect(x, y + 330, 20, 70);
                g.fillRect(x, y + 340, 40, 60);
                g.fillRect(x, y + 360, 60, 40);
                g.fillRect(x, y + 380, 70, 20);
                g.fillRect(x, y + 390, 90, 10);


                g.setColor(getMaskColor(color));
                g.fillRect(x + 180, y + 310, 20, 90);
                g.fillRect(x + 160, y + 330, 40, 70);
                g.fillRect(x + 150, y + 340, 50, 60);
                g.fillRect(x + 140, y + 350, 10, 50);
                g.fillRect(x + 130, y + 360, 70, 40);
                g.fillRect(x + 110, y + 380, 90, 20);

                g.setColor(color);
                g.fillRect(x + 190, y + 310, 10, 90);
                g.fillRect(x + 180, y + 330, 20, 70);
                g.fillRect(x + 160, y + 340, 40, 60);
                g.fillRect(x + 140, y + 360, 60, 40);
                g.fillRect(x + 130, y + 380, 70, 20);
                g.fillRect(x + 110, y + 390, 90, 10);


                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 110, 20, 80);
                g.fillRect(x, y + 130, 40, 40);
                g.fillRect(x, y + 140, 50, 20);

                g.setColor(color);
                g.fillRect(x, y + 110, 10, 80);
                g.fillRect(x, y + 130, 20, 40);
                g.fillRect(x, y + 140, 40, 20);

                g.setColor(getMaskColor(color));
                g.fillRect(x + 180, y + 110, 20, 80);
                g.fillRect(x + 160, y + 130, 40, 40);
                g.fillRect(x + 150, y + 140, 50, 20);

                g.setColor(color);
                g.fillRect(x + 190, y + 110, 10, 80);
                g.fillRect(x + 180, y + 130, 20, 40);
                g.fillRect(x + 160, y + 140, 40, 20);

                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 210, 20, 80);
                g.fillRect(x, y + 230, 40, 40);
                g.fillRect(x, y + 240, 50, 20);

                g.setColor(color);
                g.fillRect(x, y + 210, 10, 80);
                g.fillRect(x, y + 230, 20, 40);
                g.fillRect(x, y + 240, 40, 20);

                g.setColor(getMaskColor(color));
                g.fillRect(x + 180, y + 210, 20, 80);
                g.fillRect(x + 160, y + 230, 40, 40);
                g.fillRect(x + 150, y + 240, 50, 20);

                g.setColor(color);
                g.fillRect(x + 190, y + 210, 10, 80);
                g.fillRect(x + 180, y + 230, 20, 40);
                g.fillRect(x + 160, y + 240, 40, 20);

                g.setColor(Banner.MASK);
                g.fillRect(x, y, 90, 10);
                g.fillRect(x, y + 10, 10, 80);
                g.fillRect(x, y + 110, 10, 80);

                g.fillRect(x + 110, y, 90, 10);
                g.fillRect(x + 190, y + 10, 10, 80);
                g.fillRect(x + 190, y + 110, 10, 80);

                g.fillRect(x, y + 390, 90, 10);
                g.fillRect(x, y + 310, 10, 80);
                g.fillRect(x, y + 210, 10, 80);

                g.fillRect(x + 110, y + 390, 90, 10);
                g.fillRect(x + 190, y + 310, 10, 80);
                g.fillRect(x + 190, y + 210, 10, 80);
                break;
            case BOTTOM_TRIANGLE:
                for (i = 0; i < 10; i++) {
                    g.setColor(color);
                    g.fillRect(x + 10 * i, y + 390 - 20 * i,
                            20 * (10 - i), 10 + 20 * i);
                    g.setColor(getMaskColor(color));
                    if (i < 9) {
                        g.fillRect(x + 10 * i, y + 370 - 20 * i, 10, 20);
                        g.fillRect(x + 190 - 10 * i, y + 370 - 20 * i,
                                10, 20);
                    } else {
                        g.fillRect(x + 10 * i, y + 380 - 20 * i, 10, 10);
                        g.fillRect(x + 190 - 10 * i, y + 380 - 20 * i,
                                10, 10);
                    }
                }
                g.setColor(Banner.MASK);
                g.fillRect(x, y + 390, 200, 10);
                break;
            case TOP_TRIANGLE:
                for (i = 0; i < 10; i++) {
                    g.setColor(color);
                    g.fillRect(x + 10 * i, y,
                            20 * (10 - i), 10 + 20 * i);
                    g.setColor(getMaskColor(color));
                    if (i < 9) {
                        g.fillRect(x + 10 * i, y + 10 + 20 * i, 10, 20);
                        g.fillRect(x + 190 - 10 * i, y + 10 + 20 * i,
                                10, 20);
                    } else {
                        g.fillRect(x + 10 * i, y + 10 + 20 * i, 10, 10);
                        g.fillRect(x + 190 - 10 * i, y + 10 + 20 * i,
                                10, 10);
                    }
                }
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 200, 10);
                break;
            case BOTTOM_SAW:
                g.fillRect(x, y + 390, 200, 10);
                for (i = 0; i < 3; i++) {
                    g.setColor(color);
                    g.fillRect(x + 70 * i, y + 380, 60, 20);
                    g.fillRect(x + 10 + 70 * i, y + 360, 40, 20);
                    g.fillRect(x + 20 + 70 * i, y + 340, 20, 20);
                    g.setColor(getMaskColor(color));
                    g.fillRect(x + 70 * i, y + 360, 10, 20);
                    g.fillRect(x + 10 + 70 * i, y + 340, 10, 20);
                    g.fillRect(x + 20 + 70 * i, y + 330, 20, 10);
                    g.fillRect(x + 40 + 70 * i, y + 340, 10, 20);
                    g.fillRect(x + 50 + 70 * i, y + 360, 10, 20);
                }
                g.fillRect(x + 60, y + 380, 10, 10);
                g.fillRect(x + 130, y + 380, 10, 10);
                g.setColor(Banner.MASK);
                g.fillRect(x, y + 390, 200, 10);
                break;
            case TOP_SAW:
                g.fillRect(x, y, 200, 10);
                for (i = 0; i < 3; i++) {
                    g.setColor(color);
                    g.fillRect(x + 70 * i, y, 60, 20);
                    g.fillRect(x + 10 + 70 * i, y + 20, 40, 20);
                    g.fillRect(x + 20 + 70 * i, y + 40, 20, 20);
                    g.setColor(getMaskColor(color));
                    g.fillRect(x + 70 * i, y + 20, 10, 20);
                    g.fillRect(x + 10 + 70 * i, y + 40, 10, 20);
                    g.fillRect(x + 20 + 70 * i, y + 60, 20, 10);
                    g.fillRect(x + 40 + 70 * i, y + 40, 10, 20);
                    g.fillRect(x + 50 + 70 * i, y + 20, 10, 20);
                }
                g.fillRect(x + 60, y + 10, 10, 10);
                g.fillRect(x + 130, y + 10, 10, 10);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 200, 10);
                break;
            case LEFT_DIAGONAL:
                for (i = 0; i < 19; i++)
                    g.fillRect(x, y, 10 + i * 10, 380 - i * 20);
                g.setColor(getMaskColor(color));
                for (i = 0; i < 20; i++)
                    g.fillRect(x + i * 10, y + 380 - i * 20, 10, 20);
                g.setColor(Banner.MASK);
                g.fillRect(x + 10, y, 180, 10);
                g.fillRect(x, y, 10, 380);
                break;
            case RIGHT_DIAGONAL:
                for (i = 0; i < 19; i++)
                    g.fillRect(x + 190 - i * 10, y,
                            10 + i * 10, 380 - i * 20);
                g.setColor(getMaskColor(color));
                for (i = 0; i < 20; i++)
                    g.fillRect(x + 190 - i * 10, y + 380 - i * 20, 10, 20);
                g.setColor(Banner.MASK);
                g.fillRect(x + 10, y, 180, 10);
                g.fillRect(x + 190, y, 10, 380);
                break;
            case CIRCLE:
                g.setColor(getMaskColor(color));
                g.fillRect(x + 90, y + 140, 20, 120);
                g.fillRect(x + 70, y + 150, 60, 100);
                g.fillRect(x + 60, y + 160, 80, 80);
                g.fillRect(x + 50, y + 170, 100, 60);
                g.fillRect(x + 40, y + 190, 120, 20);
                g.setColor(color);
                g.fillRect(x + 90, y + 150, 20, 100);
                g.fillRect(x + 70, y + 160, 60, 80);
                g.fillRect(x + 60, y + 170, 80, 60);
                g.fillRect(x + 50, y + 190, 100, 20);
                break;
            case RHOMBUS:
                for (i = 0; i < 7; i++) {
                    g.setColor(getMaskColor(color));
                    if (i < 6) {
                        g.fillRect(x + 30 + 10 * i, y + 190 - 20 * i,
                                140 - 20 * i, 20 + 40 * i);
                        g.setColor(color);
                        g.fillRect(x + 40 + 10 * i, y + 190 - 20 * i,
                                120 - 20 * i, 20 + 40 * i);
                    } else
                        g.fillRect(x + 90, y + 80, 20, 240);
                }
                break;
            case VERTICAL_HALF:
                g.fillRect(x, y, 100, 400);
                g.setColor(getMaskColor(color));
                g.fillRect(x + 100, y, 10, 400);
                g.setColor(Banner.MASK);
                g.fillRect(x + 10, y, 90, 10);
                g.fillRect(x + 10, y + 390, 90, 10);
                g.fillRect(x, y, 10, 400);
                break;
            case HORIZONTAL_HALF:
                g.fillRect(x, y, 200, 200);
                g.setColor(getMaskColor(color));
                g.fillRect(x, y + 200, 200, 10);
                g.setColor(Banner.MASK);
                g.fillRect(x, y, 10, 200);
                g.fillRect(x + 190, y, 10, 200);
                g.fillRect(x + 10, y, 180, 10);
                break;
            case CREEPER:
                g.setColor(getMaskColor(color));
                g.fillRect(x + 10, y + 140, 60, 60);
                g.fillRect(x + 130, y + 140, 60, 60);
                g.fillRect(x + 40, y + 230, 30, 90);
                g.fillRect(x + 70, y + 200, 60, 90);
                g.fillRect(x + 130, y + 230, 30, 90);
                g.setColor(color);
                g.fillRect(x + 20, y + 150, 40, 40);
                g.fillRect(x + 140, y + 150, 40, 40);
                g.fillRect(x + 50, y + 240, 10, 70);
                g.fillRect(x + 80, y + 210, 40, 70);
                g.fillRect(x + 140, y + 240, 10, 70);
                g.fillRect(x + 50, y + 240, 100, 40);
                break;
            case BRICKS:
                int offset;
                for (i = 0; i < 10; i++) {
                    offset = i % 2 * 30;

                    for (j = 0; j < 4; j++) {
                        g.setColor(getMaskColor(color));
                        g.fillRect(x + 60 * j - offset, y + i * 40, 50, 30);
                        g.setColor(color);
                        g.fillRect(x + 60 * j - offset, y + i * 40, 40, 20);
                        g.setColor(getMaskColor(color));
                        g.fillRect(x + 40 + 60 * j - offset, y + i * 40,
                                10, 10);
                    }
                }
                g.setColor(BannerPanel.background);
                g.fillRect(x - 30, y, 30, 400);
                g.fillRect(x + 200, y, 30, 400);
                break;
            case GRADIENT:
                for (i = 0; i < 40; i++) {
                    g.setColor(new Color(
                            color.getRed(), color.getGreen(), color.getBlue(),
                            (int) ((40 - i) / 40.0 * 255)));
                    g.fillRect(x, y + i * 10, 200, 10);
                }
                g.setColor(getMaskColor(color));
                g.fillRect(x, y, 200, 10);
                break;
            case SKULL:
                g.setColor(getMaskColor(color));

                g.fillRect(x + 30, y + 210, 20, 20);
                g.fillRect(x + 50, y + 220, 20, 20);
                g.fillRect(x + 70, y + 230, 20, 20);
                g.fillRect(x + 30, y + 260, 30, 10);

                g.fillRect(x + 90, y + 240, 20, 10);
                g.fillRect(x + 60, y + 250, 80, 10);

                g.fillRect(x + 150, y + 210, 20, 20);
                g.fillRect(x + 130, y + 220, 20, 20);
                g.fillRect(x + 110, y + 230, 20, 20);
                g.fillRect(x + 140, y + 260, 30, 10);

                g.setColor(color);

                g.fillRect(x + 60, y + 120, 80, 40);
                g.fillRect(x + 60, y + 190, 80, 10);
                g.fillRect(x + 60, y + 120, 10, 80);
                g.fillRect(x + 130, y + 120, 10, 80);
                g.fillRect(x + 70, y + 170, 20, 10);
                g.fillRect(x + 90, y + 160, 20, 10);
                g.fillRect(x + 110, y + 170, 20, 10);

                g.fillRect(x + 20, y + 200, 20, 20);
                g.fillRect(x + 20, y + 200, 10, 30);
                g.fillRect(x + 40, y + 220, 20, 10);
                g.fillRect(x + 60, y + 230, 20, 10);
                g.fillRect(x + 80, y + 240, 10, 20);

                g.fillRect(x + 90, y + 250, 20, 10);

                g.fillRect(x + 160, y + 200, 20, 20);
                g.fillRect(x + 170, y + 200, 10, 30);
                g.fillRect(x + 140, y + 220, 20, 10);
                g.fillRect(x + 120, y + 230, 20, 10);
                g.fillRect(x + 110, y + 240, 10, 20);

                g.fillRect(x + 20, y + 260, 10, 30);
                g.fillRect(x + 30, y + 270, 10, 20);
                g.fillRect(x + 40, y + 270, 20, 10);
                g.fillRect(x + 60, y + 260, 20, 10);

                g.fillRect(x + 170, y + 260, 10, 30);
                g.fillRect(x + 160, y + 270, 10, 20);
                g.fillRect(x + 140, y + 270, 20, 10);
                g.fillRect(x + 120, y + 260, 20, 10);

                g.setColor(new Color(color.getRed(),
                        color.getGreen(),
                        color.getBlue(),
                        90));

                g.fillRect(x + 70, y + 160, 20, 10);
                g.fillRect(x + 90, y + 170, 20, 10);
                g.fillRect(x + 110, y + 160, 20, 10);
                g.fillRect(x + 70, y + 180, 60, 10);

                break;
            case FLOWER:
                g.setColor(getMaskColor(color));

                g.fillRect(x + 80, y + 170, 40, 60);
                g.fillRect(x + 70, y + 180, 60, 40);

                g.fillRect(x + 80, y + 120, 40, 20);
                g.fillRect(x + 40, y + 140, 120, 20);
                g.fillRect(x + 90, y + 110, 20, 10);

                g.fillRect(x + 30, y + 130, 40, 10);
                g.fillRect(x + 40, y + 120, 20, 10);
                g.fillRect(x + 60, y + 160, 10, 10);

                g.fillRect(x + 130, y + 130, 40, 10);
                g.fillRect(x + 140, y + 120, 20, 10);
                g.fillRect(x + 130, y + 160, 10, 10);


                g.fillRect(x + 80, y + 260, 40, 20);
                g.fillRect(x + 40, y + 240, 120, 20);
                g.fillRect(x + 90, y + 280, 20, 10);

                g.fillRect(x + 30, y + 260, 40, 10);
                g.fillRect(x + 40, y + 270, 20, 10);
                g.fillRect(x + 60, y + 230, 10, 10);

                g.fillRect(x + 130, y + 260, 40, 10);
                g.fillRect(x + 140, y + 270, 20, 10);
                g.fillRect(x + 130, y + 230, 10, 10);


                g.fillRect(x + 10, y + 160, 10, 20);
                g.fillRect(x + 20, y + 150, 10, 10);
                g.fillRect(x + 20, y + 160, 20, 30);

                g.fillRect(x + 50, y + 170, 10, 60);

                g.fillRect(x + 10, y + 220, 10, 20);
                g.fillRect(x + 20, y + 240, 10, 10);
                g.fillRect(x + 20, y + 210, 20, 30);


                g.fillRect(x + 180, y + 160, 10, 20);
                g.fillRect(x + 170, y + 150, 10, 10);
                g.fillRect(x + 160, y + 160, 20, 30);

                g.fillRect(x + 140, y + 170, 10, 60);

                g.fillRect(x + 180, y + 220, 10, 20);
                g.fillRect(x + 170, y + 240, 10, 10);
                g.fillRect(x + 160, y + 210, 20, 30);

                g.setColor(color);

                g.fillRect(x + 80, y + 180, 40, 40);

                g.fillRect(x + 90, y + 120, 20, 20);
                g.fillRect(x + 50, y + 140, 100, 10);

                g.fillRect(x + 40, y + 130, 20, 10);
                g.fillRect(x + 50, y + 150, 20, 10);
                g.fillRect(x + 40, y + 150, 20, 20);

                g.fillRect(x + 140, y + 130, 20, 10);
                g.fillRect(x + 130, y + 150, 20, 10);
                g.fillRect(x + 140, y + 150, 20, 20);


                g.fillRect(x + 90, y + 260, 20, 20);
                g.fillRect(x + 50, y + 250, 100, 10);

                g.fillRect(x + 40, y + 260, 20, 10);
                g.fillRect(x + 50, y + 240, 20, 10);
                g.fillRect(x + 40, y + 230, 20, 20);

                g.fillRect(x + 140, y + 260, 20, 10);
                g.fillRect(x + 130, y + 240, 20, 10);
                g.fillRect(x + 140, y + 230, 20, 20);


                g.fillRect(x + 20, y + 160, 10, 20);
                g.fillRect(x + 30, y + 170, 10, 10);

                g.fillRect(x + 40, y + 170, 10, 60);

                g.fillRect(x + 20, y + 220, 10, 20);
                g.fillRect(x + 30, y + 220, 10, 10);


                g.fillRect(x + 170, y + 160, 10, 20);
                g.fillRect(x + 160, y + 170, 10, 10);

                g.fillRect(x + 150, y + 170, 10, 60);

                g.fillRect(x + 170, y + 220, 10, 20);
                g.fillRect(x + 160, y + 220, 10, 10);
                break;
            case MOJANG_LOGO:
                g.setColor(getMaskColor(color));
                g.fillRect(x + 20, y + 160, 40, 110);
                g.fillRect(x + 30, y + 150, 10, 10);
                g.fillRect(x + 50, y + 140, 40, 10);
                g.fillRect(x + 90, y + 150, 10, 10);
                g.fillRect(x + 110, y + 160, 10, 10);
                g.fillRect(x + 120, y + 150, 10, 10);
                g.fillRect(x + 130, y + 160, 10, 10);
                g.fillRect(x + 140, y + 120, 10, 10);
                g.fillRect(x + 140, y + 150, 20, 10);
                g.fillRect(x + 70, y + 170, 40, 10);
                g.fillRect(x + 30, y + 270, 10, 10);
                g.fillRect(x + 50, y + 280, 110, 10);
                g.fillRect(x + 160, y + 260, 20, 20);
                g.fillRect(x + 60, y + 240, 10, 10);
                g.fillRect(x + 70, y + 250, 10, 10);
                g.fillRect(x + 80, y + 260, 20, 10);
                g.fillRect(x + 130, y + 180, 10, 10);
                g.fillRect(x + 140, y + 190, 10, 10);
                g.fillRect(x + 150, y + 200, 10, 10);
                g.fillRect(x + 160, y + 220, 10, 10);
                g.fillRect(x + 170, y + 200, 10, 20);
                g.fillRect(x + 160, y + 170, 10, 30);

                g.setColor(color);
                g.fillRect(x + 30, y + 160, 20, 110);
                g.fillRect(x + 40, y + 150, 20, 50);
                g.fillRect(x + 40, y + 150, 30, 40);
                g.fillRect(x + 40, y + 150, 50, 10);
                g.fillRect(x + 40, y + 160, 70, 10);
                g.fillRect(x + 110, y + 170, 50, 10);
                g.fillRect(x + 120, y + 160, 10, 10);
                g.fillRect(x + 140, y + 180, 20, 10);
                g.fillRect(x + 150, y + 190, 10, 10);
                g.fillRect(x + 160, y + 200, 10, 20);
                g.fillRect(x + 140, y + 130, 20, 20);
                g.fillRect(x + 40, y + 230, 20, 40);
                g.fillRect(x + 60, y + 250, 10, 20);
                g.fillRect(x + 40, y + 260, 40, 20);
                g.fillRect(x + 80, y + 270, 90, 10);

                break;
        }
    }

    public void setStyle(Banner.Style newStyle) {
        this.style = newStyle;
    }

    public Banner.Style getStyle() {
        return style;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public Color getColor() {
        return color;
    }

    private Color getMaskColor(Color color) {
        return new Color(color.getRed(),
                color.getGreen(),
                color.getBlue(),
                180);
    }

    public String toString() {
        return "Style: " + style + "  Color: " + color;
    }
}
