# 安装
npm i react-native-statusbar-props

# 自动链接项目
react-native link react-native-statusbar-props
# 手动链接项目 安卓
#### settings.gradle

```
include ":react-native-statusbar-props"

project(":react-native-statusbar-props").projectDir = new File(rootProject.projectDir,"../node_modules/react-native-statusbar-props/android")
```


#### build.gradle

```
dependencies {
    compile fileTree(dir: "libs", include: ["*.jar"])
    compile "com.android.support:appcompat-v7:23.0.1"
    compile "com.facebook.react:react-native:+"  // From node_modules
    compile project(":react-native-statusbar-props")<---添加这一行
}
```

#### MainApplication.java

```
import com.statusbar.props.RCTStatusbarPropsPackage;

@Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
              new RCTStatusbarPropsPackage()<-----添加这一行
      );
    }
```
#### 目前支持属性
获取状态栏高度
#### 用法示例

```
import statusbarprops from 'react-native-statusbar-props';

statusbarprops.getHeight(val=>{console.log(val)})
```

# github地址
https://github.com/gaokaikai/react-native-statusbar-props

留个❤️可好

# bug及问题提交地址
https://github.com/gaokaikai/react-native-statusbar-props/issues