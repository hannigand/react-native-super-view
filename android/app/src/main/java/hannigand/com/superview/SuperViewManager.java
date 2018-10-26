package hannigand.com.superview;

import android.graphics.Color;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ViewGroupManager;

import com.gigamole.library.ShadowLayout;

public class SuperViewManager extends ViewGroupManager<ShadowLayout> {
    public static final String REACT_CLASS = "RCTSuperView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ShadowLayout createViewInstance(ThemedReactContext context) {
        return new ShadowLayout(context);
    }

    @ReactProp(name = "color")
    public void setShadowColor(ShadowLayout view, String color) {
        view.setShadowColor(Color.parseColor(color));
    }

    @ReactProp(name = "angle", defaultFloat = 45)
    public void setShadowAngle(ShadowLayout view, float angle) {
        view.setShadowAngle(angle);
    }

    @ReactProp(name = "distance", defaultFloat = 30)
    public void setShadowDistance(ShadowLayout view, float distance) {
        view.setShadowDistance(distance);
    }

    @ReactProp(name = "radius", defaultFloat = 20)
    public void setShadowRadius(ShadowLayout view, float radius) {
        view.setShadowRadius(radius);
    }

    @ReactProp(name = "clipChildren", defaultBoolean = false)
    public void setClipChildren(ShadowLayout view, boolean clipChildren) {
        view.setClipChildren(clipChildren);
    }
}
