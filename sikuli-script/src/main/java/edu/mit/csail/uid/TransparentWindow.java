package edu.mit.csail.uid;

import javax.swing.JWindow;

public class TransparentWindow extends JWindow {
   public void setOpacity(float alpha){
      Env.getOSUtil().setWindowOpacity(this, alpha);
   }
}
