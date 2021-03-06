package com.facebook.katana.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.widget.GalleryWithSwipingFix;
import custom.android.ScaleGestureDetector;
import custom.android.ScaleGestureDetector.OnScaleGestureListener;

public class PhotoGallery extends GalleryWithSwipingFix
  implements GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener
{
  private ScaleGestureDetector a = new ScaleGestureDetector(paramContext, this);
  private ImageViewTouchBase b;
  private boolean c = false;
  private boolean d = false;

  public PhotoGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    new GestureDetector(this).setOnDoubleTapListener(this);
    setSpacing(100);
  }

  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    if (paramMotionEvent2.getX() > paramMotionEvent1.getX());
    for (int i = 1; ; i = 0)
      return i;
  }

  public boolean a(ScaleGestureDetector paramScaleGestureDetector)
  {
    if (this.d);
    for (int i = 0; ; i = 1)
    {
      return i;
      float f = paramScaleGestureDetector.f() * this.b.getScale();
      this.b.a(f, paramScaleGestureDetector.b(), paramScaleGestureDetector.c());
    }
  }

  public boolean b(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }

  public void c(ScaleGestureDetector paramScaleGestureDetector)
  {
  }

  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    int i;
    if (this.d)
    {
      i = 0;
      return i;
    }
    if (this.b.getScale() > 2.0F)
      this.b.a(1.0F);
    while (true)
    {
      i = 1;
      break;
      this.b.b(3.0F, paramMotionEvent.getX(), paramMotionEvent.getY());
    }
  }

  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = this.d;
    int i = 0;
    if (bool1);
    boolean bool2;
    do
    {
      boolean bool3;
      do
      {
        boolean bool4;
        do
        {
          return i;
          if (this.b.getImageRight() <= this.b.getWidth())
            break;
          bool4 = a(paramMotionEvent1, paramMotionEvent2);
          i = 0;
        }
        while (!bool4);
        if (this.b.getImageLeft() >= 0.0F)
          break;
        bool3 = a(paramMotionEvent1, paramMotionEvent2);
        i = 0;
      }
      while (bool3);
      bool2 = this.c;
      i = 0;
    }
    while (bool2);
    if (a(paramMotionEvent1, paramMotionEvent2));
    for (int j = 21; ; j = 22)
    {
      onKeyDown(j, null);
      i = 1;
      break;
    }
  }

  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = this.d;
    boolean bool2 = false;
    if (bool1);
    while (true)
    {
      return bool2;
      if ((this.b.getScale() > 1.5F) || ((this.b.getImageRight() > this.b.getWidth()) && (!a(paramMotionEvent1, paramMotionEvent2))) || ((this.b.getImageLeft() < 0.0F) && (a(paramMotionEvent1, paramMotionEvent2))))
      {
        this.b.a(-paramFloat1, -paramFloat2);
        bool2 = true;
        continue;
      }
      boolean bool3 = this.c;
      bool2 = false;
      if (bool3)
        continue;
      bool2 = super.onScroll(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
    }
  }

  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = this.d;
    boolean bool2 = false;
    if (bool1);
    while (true)
    {
      return bool2;
      int i = getChildCount();
      bool2 = false;
      if (i == 0)
        continue;
      View localView = getSelectedView();
      if (localView == null)
      {
        bool2 = super.onTouchEvent(paramMotionEvent);
        continue;
      }
      this.b = ((ImageViewTouchBase)(ImageViewTouchBase)localView.findViewById(2131296625));
      if (paramMotionEvent.getPointerCount() >= 2)
      {
        this.a.a(paramMotionEvent);
        if (this.a.a())
        {
          bool2 = true;
          continue;
        }
      }
      bool2 = super.onTouchEvent(paramMotionEvent);
    }
  }
}

/* Location:           /data1/software/jd-gui/com.facebook.katana_2.0_liqucn.com-dex2jar.jar
 * Qualified Name:     com.facebook.katana.ui.PhotoGallery
 * JD-Core Version:    0.6.0
 */