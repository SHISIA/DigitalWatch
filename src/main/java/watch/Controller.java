package watch;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    public Label today;
    public Text tsecond;
    public Text thour;
    public Text tminute;
    public Text stroke12;
    public Text stroke6;
    public Text stroke3;
    public Text stroke9;
    public Text stroke11;
    public Text stroke1;
    public Text stroke2;
    public Text stroke5;
    public Text stroke4;
    public Text stroke8;
    public Text stroke7;
    public Text stroke10;
    public Text daytime;
    public Text Em;
    public Label ownerName;
    public Text WISHER;

    String[] time;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        String name=System.getProperty("user.name");
        ownerName.setText(name);
        Thread thread= new Thread(() -> {
            
            Date date;
            while (true){
                date=new Date();
                time= date.toString().split(" ");
                String s[]=time[3].split(":");
                tminute.setText(s[1]);
                tsecond.setText(s[2]);
                int hour=Integer.parseInt(s[0]);
                int minute=Integer.parseInt(s[1]);
                String hawa=""+hour;
                thour.setText(hawa);

                //switch start

                switch (hour){
                    case 0:
                    case 24:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 1:
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke1.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 2:
                        stroke1.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke2.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 3:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke3.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 4:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke4.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 5:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke5.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 6:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);

                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke6.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 7:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke7.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 8:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke8.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 9:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);

                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke9.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 10:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);

                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke10.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 11:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);

                        stroke12.setVisible(false);
                        stroke11.setVisible(true);
                        daytime.setText("Morning");
                        daytime.setVisible(true);
                        Em.setText("AM");
                        break;
                    case 12:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(true);
                        int min=Integer.parseInt(s[1]);
                        if (min==0){
                            daytime.setText("Noon");
                            daytime.setVisible(true);
                            Em.setText("AM");
                        }else if (min>0){
                            daytime.setText("Afternoon");

                            daytime.setVisible(true);
                            Em.setText("PM");
                        }
                        break;
                    case 13:

                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke1.setVisible(true);
                        daytime.setText("Afternoon");
                        daytime.setVisible(true);
                        Em.setText("PM");
                        break;
                    case 14:
                        stroke1.setVisible(false);

                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke2.setVisible(true);
                        daytime.setText("Afternoon");
                        daytime.setVisible(true);
                        Em.setText("PM");
                        break;
                    case 15:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);

                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke3.setVisible(true);
                        daytime.setText("Afternoon");
                        daytime.setVisible(true);
                        Em.setText("PM");
                        break;
                    case 16:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);

                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke4.setVisible(true);
                        daytime.setText("Afternoon");
                        daytime.setVisible(true);
                        Em.setText("PM");
                        break;
                    case 17:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke5.setVisible(true);
                        int mine=Integer.parseInt(s[1]);
                        if (mine<=59){
                            daytime.setText("Afternoon");
                            Em.setText("PM");
                            daytime.setVisible(true);
                        }else
                            daytime.setText("Evening");
                        Em.setText("PM");
                            break;
                    case 18:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);

                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke6.setVisible(true);
                        daytime.setText("Evening");
                        daytime.setVisible(true);
                        Em.setText("PM");
                        break;
                    case 19:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);

                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        daytime.setText("Evening");
                        daytime.setVisible(true);
                        stroke7.setVisible(true);
                        break;
                    case 20:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);

                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        stroke8.setVisible(true);
                        daytime.setText("Night");
                        daytime.setVisible(true);
                        break;
                    case 21:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);

                        stroke10.setVisible(false);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        daytime.setText("Night");
                        daytime.setVisible(true);
                        stroke9.setVisible(true);
                        break;
                    case 22:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        daytime.setVisible(true);
                        stroke11.setVisible(false);
                        stroke12.setVisible(false);
                        daytime.setText("Night");

                        stroke10.setVisible(true);
                        break;
                    case 23:
                        stroke1.setVisible(false);
                        stroke2.setVisible(false);
                        stroke3.setVisible(false);
                        stroke4.setVisible(false);
                        stroke5.setVisible(false);
                        stroke6.setVisible(false);
                        stroke7.setVisible(false);
                        stroke8.setVisible(false);
                        stroke9.setVisible(false);
                        stroke10.setVisible(false);
                        daytime.setVisible(true);
                        daytime.setText("Night");
                        stroke12.setVisible(false);
                        stroke11.setVisible(true);
                        break;
                    default:
                        //do nothing
                        break;
                }

                //switch end

                if (hour==12&& minute==0){
                    int trex=hour;
                    String strex=trex+"";
                    thour.setText(strex);

                    Em.setText("AM");
                    daytime.setText("Noon");
                    daytime.setVisible(true);
                }else if (hour>=12 && minute>0){
                    Em.setText("PM");
                }
                String dayMessage=daytime.getText();
                WISHER.setText("Nice "+dayMessage+" "+name);
                
                
                today.setText(time[0]+" "+time[2]+" "+time[1]+" "+time[5]);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        });
        thread.start();

    }

    public void closeSystem(){
        System.exit(0);
    }
    
}
