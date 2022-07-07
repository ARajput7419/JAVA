import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class PrintSymbol {

    private static void drawLine(Graphics graphics,int x1,int y1,int x2,int y2,Color [] colors,String character){
        double slope = (y2-y1)/(double)(x2-x1);
        int i =0;
        for (int current=x1;current<=x2;current++) {
            graphics.setColor(colors[i]);
            i=(i+1)%colors.length;
            graphics.drawString(character,current, (int) Math.round(slope * (current - x1) + y1));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius ");
        int r = scanner.nextInt();
        System.out.println("Enter character ");
        String character = scanner.next();
        Color []colors = {Color.RED,Color.WHITE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.MAGENTA};
        JFrame frame  = new JFrame(" Pattern ");
        frame.setVisible(true);
        frame.setSize(800,600);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Canvas canvas = new Canvas(){
          @Override
          public  void paint(Graphics graphics){
                      drawLine(graphics,-r+400,r+330,400,-r+270,colors,character);
                      int i =0;
                      for(int x = -r;x<=0;x++){
                          graphics.setColor(colors[i]);
                          i=(i+1)%colors.length;
                          double temp = Math.sqrt(r*r-x*x);
                          int first = (int)-Math.round(temp);
                          int second = (int)Math.round(temp);
                          graphics.drawString(character,x+400,first+300);
                          graphics.drawString(character,x+400,second+300);
                          try {
                              Thread.sleep(50);
                          } catch (InterruptedException e) {
                              e.printStackTrace();
                          }
                      }
                      graphics.setColor(Color.WHITE);
                      graphics.drawString("Pattern - Aniket and Praveen ",30,30);

          }
        };
        frame.add(canvas);
        canvas.setBackground(Color.BLACK);
    }
}
