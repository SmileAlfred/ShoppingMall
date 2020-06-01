package com.youth.banner;

import androidx.viewpager.widget.ViewPager;

import com.youth.banner.transformer.AccordionTransformer;
import com.youth.banner.transformer.BackgroundToForegroundTransformer;
import com.youth.banner.transformer.CubeInTransformer;
import com.youth.banner.transformer.CubeOutTransformer;
import com.youth.banner.transformer.DefaultTransformer;
import com.youth.banner.transformer.DepthPageTransformer;
import com.youth.banner.transformer.FlipHorizontalTransformer;
import com.youth.banner.transformer.FlipVerticalTransformer;
import com.youth.banner.transformer.ForegroundToBackgroundTransformer;
import com.youth.banner.transformer.RotateDownTransformer;
import com.youth.banner.transformer.RotateUpTransformer;
import com.youth.banner.transformer.ScaleInOutTransformer;
import com.youth.banner.transformer.StackTransformer;
import com.youth.banner.transformer.TabletTransformer;
import com.youth.banner.transformer.ZoomInTransformer;
import com.youth.banner.transformer.ZoomOutSlideTransformer;
import com.youth.banner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends ViewPager.PageTransformer> Default = (Class<? extends ViewPager.PageTransformer>) DefaultTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Accordion = (Class<? extends ViewPager.PageTransformer>) AccordionTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> BackgroundToForeground = (Class<? extends ViewPager.PageTransformer>) BackgroundToForegroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ForegroundToBackground = (Class<? extends ViewPager.PageTransformer>) ForegroundToBackgroundTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeIn = (Class<? extends ViewPager.PageTransformer>) CubeInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> CubeOut = (Class<? extends ViewPager.PageTransformer>) CubeOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> DepthPage = (Class<? extends ViewPager.PageTransformer>) DepthPageTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipHorizontal = (Class<? extends ViewPager.PageTransformer>) FlipHorizontalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> FlipVertical = (Class<? extends ViewPager.PageTransformer>) FlipVerticalTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateDown = (Class<? extends ViewPager.PageTransformer>) RotateDownTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> RotateUp = (Class<? extends ViewPager.PageTransformer>) RotateUpTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ScaleInOut = (Class<? extends ViewPager.PageTransformer>) ScaleInOutTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Stack = (Class<? extends ViewPager.PageTransformer>) StackTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> Tablet = (Class<? extends ViewPager.PageTransformer>) TabletTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomIn = (Class<? extends ViewPager.PageTransformer>) ZoomInTransformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOut = (Class<? extends ViewPager.PageTransformer>) ZoomOutTranformer.class;
    public static Class<? extends ViewPager.PageTransformer> ZoomOutSlide = (Class<? extends ViewPager.PageTransformer>) ZoomOutSlideTransformer.class;
}
