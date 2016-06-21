#### [中文版文档](https://github.com/captainbupt/android-Ultra-Pull-To-Refresh-With-Load-More/blob/master/README-cn.md)

# Ultra Pull To Refresh with Load More

This is a modification of the *Ultra-Pull-to-Refresh* library which supports load-more for any view.

# Updates for 1.0.3

In order to add more features, I have separated some of configuration which was shared by header and footer before, like `resistance` and `durationToClose`. To avoid misunderstanding of variable and configuration names, there are some changes that you need to be aware. 

- in the old version, `ptr_duration_to_close` means the time to back to **refreshing** position when release and so as the function `setDurationToClose`. In the meanwhile, `ptr_duration_to_close_header` means the time to hide the header. This is a little bit confusing especially when add more features for footer. So, in the new version, **there is no `ptr_duration_to_close` but `ptr_duration_to_back_refresh` instead.** Also, the header and footer can separated by `ptr_duration_to_back_header` and `ptr_duration_to_back_footer`.
- `ptr_duration_to_close_either` means the time to back to **start** position (which is invisible) when refreshing completed.
- `ptr_resistance` can also be separated by `ptr_resistance_header` and `ptr_resistance_footer`.

Check the class `FooterFeatures` for some features I have added for footer. I'd like to receiver any feedback for improvement.

## Load more

[Ultra Pull to Refresh](https://github.com/liaohuqiu/android-Ultra-Pull-To-Refresh) is a replacement for the deprecated pull to refresh solution. It can contain any view you want. It's easy to use and more powerful than SwipeRefreshLayout. It's well designed, you can customize the UI effect you want as easy as adding a headview to ListView.

It supports every view as well. All the logic is similar to the pull-to-refresh and the configurations(resistance, duration etc.) are shared for both load-more and pull-to-refresh. All the APIs for the origin branch are not modified. If you have used the origin *Ultra-Pull-To-Refresh library*, **there will be no need to change your code if you move to this branch**.

Currently, only the `Home page（PtrDemoHomeFragment）` and `AutoRefresh（WithGridView）` page in demo are modified to demonstrate how to use load-more. 

Support `API LEVEL >= 8`, all snapshots are taken from Genymotion, 2.3.7.

## New functions and classes

- `setFooterView`: Corresponding to `setHeaderView()`. You may also need call `addPtrUIHandler()` after setting the footer view, which is the same mechanism as setting header.
- `PtrHandler2`: A complementary of `PtrHandler`. When using load more function, you should call `setPtrHandler(new PtrHandler2())`, rather than `setPtrHandler(new PtrHandler())`.
- `PtrDefaultHandler2`: Implemented a default `checkCanDoLoadMore()` logic. The same mechanism as `PtrDefaultHandler`.
- `PtrClassicDefaultFooter`: Serve as a default footer which is the reverse of the default header.
- `setMode(Mode)`: The mode is a new feature of this library. By using `setMode`, you can enable or disable either header or footer. The argument is an enum, you should it like `setMode(Mode.BOTH)`.

## Usage

- in gradle:
```
    compile 'in.srain.cube:ptr-load-more:1.0.3’
```

- in maven：
```

<dependency>
	<groupId>in.srain.cube</groupId>
	<artifactId>ptr-load-more</artifactId>
	<version>1.0.3</version>
	<type>pom</type>
</dependency>
```

## Contacts

- Github: https://github.com/captainbupt
- Email: weizhou.captain.he@gmail.com

If there is any suggestions or problems, please feel no hesitated to open an issue. I will keep responsing.

---

[![Build Status](https://travis-ci.org/liaohuqiu/android-Ultra-Pull-To-Refresh.svg?branch=master)](https://travis-ci.org/liaohuqiu/android-Ultra-Pull-To-Refresh)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Ultra%20Pull%20To%20Refresh-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1180)

# Ultra Pull To Refresh



[Download APK](https://raw.githubusercontent.com/liaohuqiu/android-Ultra-Pull-To-Refresh/master/ptr-demo.apk)

* StoreHouse Style first! Thanks to [CBStoreHouseRefreshControl](https://github.com/coolbeet/CBStoreHouseRefreshControl).
    <div class='row'>
        <img src='http://srain-github.qiniudn.com/ultra-ptr/store-house-string-array.gif' width="300px" style='border: #f1f1f1 solid 1px'/>
        <img src='http://srain-github.qiniudn.com/ultra-ptr/store-house-string.gif' width="300px" style='border: #f1f1f1 solid 1px'/>
    </div>

* Material Style, added @ 2014-12-09. **There is a beautiful shadow which looks terrible in gif snapshot. Please Check out the DEMO.**
    <div class='row'>
        <img src='http://srain-github.qiniudn.com/ultra-ptr/material-style.gif' width="300px"/>
    </div>

* **Supports all of the views**: 
    ListView, GridView, ScrollView, FrameLayout, or Even a single TextView.
    <div><img src='http://srain-github.qiniudn.com/ultra-ptr/contains-all-of-views.gif' width="300px" style='border: #f1f1f1 solid 1px'/></div>

* Supports all of the refresh types.
    * pull to refresh
        <div><img src='http://srain-github.qiniudn.com/ultra-ptr/pull-to-refresh.gif' width="300px" style='border: #f1f1f1 solid 1px'/></div>
    * release to refresh
        <div><img src='http://srain-github.qiniudn.com/ultra-ptr/release-to-refresh.gif' width="300px" style='border: #f1f1f1 solid 1px'/></div>

    * keep header when refresh 

        <img src='http://srain-github.qiniudn.com/ultra-ptr/keep-header.gif' width="300px"/>

    * hide header when refresh

        <img src='http://srain-github.qiniudn.com/ultra-ptr/hide-header.gif' width="300px" sytle='border: #f1f1f1 solid 1px'/>

    * auto refresh

        <img src='http://srain-github.qiniudn.com/ultra-ptr/auto-refresh.gif' width="300px" sytle='border: #f1f1f1 solid 1px'/></div>

# Usage

#### Maven Central

This project has been pushed to Maven Central, both in `aar` and `apklib`.

The latest version: `1.0.11`, has been published to: https://oss.sonatype.org/content/repositories/snapshots, in gradle:

```
maven {
    url 'https://oss.sonatype.org/content/repositories/snapshots'
}
```

The stable version: `1.0.11`, https://oss.sonatype.org/content/repositories/releases, in gradle:

```
mavenCentral()
```

pom.xml, latest version:

```xml
<dependency>
    <groupId>in.srain.cube</groupId>
    <artifactId>ultra-ptr</artifactId>
    <type>aar</type>
    <!-- or apklib format, if you want -->
    <!-- <type>apklib</type> -->
    <version>1.0.11</version>
</dependency>
```

pom.xml, stable version:

```xml
<dependency>
    <groupId>in.srain.cube</groupId>
    <artifactId>ultra-ptr</artifactId>
    <type>aar</type>
    <!-- or apklib format, if you want -->
    <!-- <type>apklib</type> -->
    <version>1.0.11</version>
</dependency>
```

gradle, latest version:

```
compile 'in.srain.cube:ultra-ptr:1.0.11'
```

gradle, stable version:

```
compile 'in.srain.cube:ultra-ptr:1.0.11'
```

#### Config

There are 6 properties:

* Resistence

    This is the resistence while you are moving the frame, default is: `1.7f`.

* Ratio of the Height of the Header to Refresh

    The ratio of the height of the header to trigger refresh, default is: `1.2f`.

* Duration to Close

    The duration for moving from the position you relase the view to the height of header, default is `200ms`.

* Duration to Close Header

    The default value is `1000ms`

* Keep Header while Refreshing

    The default value is `true`.

* Pull to Refresh / Release to Refresh

    The default value is Release to Refresh.

##### Config in xml

```xml
<in.srain.cube.views.ptr.PtrFrameLayout
    android:id="@+id/store_house_ptr_frame"
    xmlns:cube_ptr="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"

    cube_ptr:ptr_resistance="1.7"
    cube_ptr:ptr_ratio_of_header_height_to_refresh="1.2"
    cube_ptr:ptr_duration_to_close="300"
    cube_ptr:ptr_duration_to_close_header="2000"
    cube_ptr:ptr_keep_header_when_refresh="true"
    cube_ptr:ptr_pull_to_fresh="false" >

    <LinearLayout
        android:id="@+id/store_house_ptr_image_content"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/cube_mints_333333"
        android:clickable="true"
        android:padding="10dp">

        <in.srain.cube.image.CubeImageView
            android:id="@+id/store_house_ptr_image"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </LinearLayout>

</in.srain.cube.views.ptr.PtrFrameLayout>
```

### Or config in java code

```java
// the following are default settings
mPtrFrame.setResistance(1.7f);
mPtrFrame.setRatioOfHeaderHeightToRefresh(1.2f);
mPtrFrame.setDurationToClose(200);
mPtrFrame.setDurationToCloseHeader(1000);
// default is false
mPtrFrame.setPullToRefresh(false);
// default is true
mPtrFrame.setKeepHeaderWhenRefresh(true);
```

### Other Config

*  `setPinContent`. Pin the content, only the `HeaderView` will be moved. 

    This's the the performance of material style in support package v19.

## StoreHouse Style

* Config using string:

```java
// header
final StoreHouseHeader header = new StoreHouseHeader(getContext());
header.setPadding(0, LocalDisplay.dp2px(15), 0, 0);

/**
 * using a string, support: A-Z 0-9 - .
 * you can add more letters by {@link in.srain.cube.views.ptr.header.StoreHousePath#addChar}
 */
header.initWithString('Alibaba');
```

* Config using string array from xml:

```java
header.initWithStringArray(R.array.storehouse);
```

And in `res/values/arrays.xml`:

```xml
<resources>
    <string-array name="storehouse">
        <item>0,35,12,42,</item>
        <item>12,42,24,35,</item>
        <item>24,35,12,28,</item>
        <item>0,35,12,28,</item>
        <item>0,21,12,28,</item>
        <item>12,28,24,21,</item>
        <item>24,35,24,21,</item>
        <item>24,21,12,14,</item>
        <item>0,21,12,14,</item>
        <item>0,21,0,7,</item>
        <item>12,14,0,7,</item>
        <item>12,14,24,7,</item>
        <item>24,7,12,0,</item>
        <item>0,7,12,0,</item>
    </string-array>
</resources>
```

# Process Refresh

There is a `PtrHandler`, by which you can refresh the data.

```
public interface PtrHandler {

    /**
     * Check can do refresh or not. For example the content is empty or the first child is in view.
     * <p/>
     * {@link in.srain.cube.views.ptr.PtrDefaultHandler#checkContentCanBePulledDown}
     */
    public boolean checkCanDoRefresh(final PtrFrameLayout frame, final View content, final View header);

    /**
     * When refresh begin
     *
     * @param frame
     */
    public void onRefreshBegin(final PtrFrameLayout frame);
}
```

An example:

```java
ptrFrame.setPtrHandler(new PtrHandler() {
    @Override
    public void onRefreshBegin(PtrFrameLayout frame) {
        frame.postDelayed(new Runnable() {
            @Override
            public void run() {
                ptrFrame.refreshComplete();
            }
        }, 1800);
    }

    @Override
    public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
        return PtrDefaultHandler.checkContentCanBePulledDown(frame, content, header);
    }
});
```


# Customize

You can add a `PtrUIHandler` to `PtrFrameLayout` to implement any UI effect you want.

```java
public interface PtrUIHandler {

    /**
     * When the content view has reached top and refresh has been completed, view will be reset.
     *
     * @param frame
     */
    public void onUIReset(PtrFrameLayout frame);

    /**
     * prepare for loading
     *
     * @param frame
     */
    public void onUIRefreshPrepare(PtrFrameLayout frame);

    /**
     * perform refreshing UI
     */
    public void onUIRefreshBegin(PtrFrameLayout frame);

    /**
     * perform UI after refresh
     */
    public void onUIRefreshComplete(PtrFrameLayout frame);

    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, int oldPosition, int currentPosition, float oldPercent, float currentPercent);
}
```

# Q & A

*  work with ViewPager: `disableWhenHorizontalMove()`

*  work with LongPressed, `setInterceptEventWhileWorking()`

# Contact & Help

Please fell free to contact me if there is any problem when using the library.

* srain@php.net
* twitter: https://twitter.com/liaohuqiu
* weibo: http://weibo.com/liaohuqiu
* blog: http://www.liaohuqiu.net
* QQ tribe: this the rule for our tribes, please read it before you request to join: https://github.com/liaohuqiu/qq-tribe-rule

    1. About how to use cube-sdk / Ultra Ptr: 271918140 (cube-sdk)
    2. For those who like thinking independently and are good at solving problem independently. Please join us, we are all here: 417208555 (cube-sdk-adv)
