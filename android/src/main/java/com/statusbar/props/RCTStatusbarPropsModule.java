package com.statusbar.props;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
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

    @ReactMethod
    public void getHeight(Callback callback){
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        callback.invoke(result);
    }
}
