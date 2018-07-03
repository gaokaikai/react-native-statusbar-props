package com.statusbar.props;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.Map;
import java.util.HashMap;
/**
 * Created by bhsj_imac on 2018/6/29.
 */

public class RCTStatusbarPropsModule extends ReactContextBaseJavaModule{
    private ReactApplicationContext context;
    public RCTStatusbarPropsModule(ReactApplicationContext reactContext){
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName() {return "StatusbarProps";}

    public int getHeight(){
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("HEIGHT", this.getHeight());
        return constants;
    }
}
