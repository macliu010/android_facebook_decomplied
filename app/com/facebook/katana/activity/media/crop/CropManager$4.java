package com.facebook.katana.activity.media.crop;

import android.view.View;
import android.view.View.OnClickListener;

class CropManager$4
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    CropDatabaseHelper.a(CropManager.a(this.a).h(), CropManager.b(this.a));
    CropManager.c(this.a);
    this.a.a();
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.activity.media.crop.CropManager.4
 * JD-Core Version:    0.6.0
 */