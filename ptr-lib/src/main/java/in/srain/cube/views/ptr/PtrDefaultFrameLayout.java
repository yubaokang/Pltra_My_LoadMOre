package in.srain.cube.views.ptr;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;

import in.srain.cube.views.ptr.header.StoreHouseHeader;

//import in.srain.cube.util.LocalDisplay;

public class PtrDefaultFrameLayout extends PtrFrameLayout {

    //    private PtrClassicDefaultHeader mPtrClassicHeader;
//    private PtrClassicDefaultFooter mPtrClassicFooter;
//
//    public PtrDefaultFrameLayout(Context context) {
//        super(context);
//        initViews();
//    }
//
//    public PtrDefaultFrameLayout(Context context, AttributeSet attrs) {
//        super(context, attrs);
//        initViews();
//    }
//
//    public PtrDefaultFrameLayout(Context context, AttributeSet attrs, int defStyle) {
//        super(context, attrs, defStyle);
//        initViews();
//    }
//
//    private void initViews() {
//        mPtrClassicHeader = new PtrClassicDefaultHeader(getContext());
//        setHeaderView(mPtrClassicHeader);
//        addPtrUIHandler(mPtrClassicHeader);
//        mPtrClassicFooter = new PtrClassicDefaultFooter(getContext());
//        setFooterView(mPtrClassicFooter);
//        addPtrUIHandler(mPtrClassicFooter);
//    }
//
//    public PtrClassicDefaultHeader getHeader() {
//        return mPtrClassicHeader;
//    }
//
//    /**
//     * Specify the last update time by this key string
//     *
//     * @param key
//     */
//    public void setLastUpdateTimeKey(String key) {
//        setLastUpdateTimeHeaderKey(key);
//        setLastUpdateTimeFooterKey(key);
//    }
//
//    public void setLastUpdateTimeHeaderKey(String key) {
//        if (mPtrClassicHeader != null) {
//            mPtrClassicHeader.setLastUpdateTimeKey(key);
//        }
//    }
//
//    public void setLastUpdateTimeFooterKey(String key) {
//        if (mPtrClassicFooter != null) {
//            mPtrClassicFooter.setLastUpdateTimeKey(key);
//        }
//    }
//
//    /**
//     * Using an object to specify the last update time.
//     *
//     * @param object
//     */
//    public void setLastUpdateTimeRelateObject(Object object) {
//        setLastUpdateTimeHeaderRelateObject(object);
//        setLastUpdateTimeFooterRelateObject(object);
//    }
//
//    public void setLastUpdateTimeHeaderRelateObject(Object object) {
//        if (mPtrClassicHeader != null) {
//            mPtrClassicHeader.setLastUpdateTimeRelateObject(object);
//        }
//    }
//
//    public void setLastUpdateTimeFooterRelateObject(Object object) {
//        if (mPtrClassicFooter != null) {
//            mPtrClassicFooter.setLastUpdateTimeRelateObject(object);
//        }
//    }
    private StoreHouseHeader header;
    private StoreHouseHeader footer;

    public PtrDefaultFrameLayout(Context context) {
        super(context);
        initViews();
    }

    public PtrDefaultFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initViews();
    }

    public PtrDefaultFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initViews();
    }

    private void initViews() {
        header = new StoreHouseHeader(getContext());
        header.setPadding(0, 10, 0, 10);
        header.initWithString("gj");
        header.setTextColor(Color.red(0x00ffff));
        setDurationToCloseHeader(1500);
        setHeaderView(header);
        addPtrUIHandler(header);

        footer = new StoreHouseHeader(getContext());
        footer.setPadding(0, 10, 0, 10);
        footer.initWithString("gj");
        footer.setTextColor(Color.red(0x00ffff));
        setFooterView(footer);
        addPtrUIHandler(footer);
    }

    public StoreHouseHeader getHeader() {
        return header;
    }

    public void setHeader(StoreHouseHeader header) {
        this.header = header;
    }

    public StoreHouseHeader getFooter() {
        return footer;
    }

    public void setFooter(StoreHouseHeader footer) {
        this.footer = footer;
    }
}
