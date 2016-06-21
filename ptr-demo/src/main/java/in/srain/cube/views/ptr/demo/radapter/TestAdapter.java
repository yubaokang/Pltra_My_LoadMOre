package in.srain.cube.views.ptr.demo.radapter;

import android.support.v7.widget.RecyclerView;

import java.util.Collection;

import in.srain.cube.views.ptr.demo.R;

/**
 * Created by yubaokang on 16-6-21.
 */
public class TestAdapter extends BaseRecyclerAdapter<String> {
    public TestAdapter(RecyclerView v, Collection<String> datas, int itemLayoutId) {
        super(v, datas, itemLayoutId);
    }

    @Override
    public void convert(RecyclerHolder holder, String item, int position, boolean isScrolling) {
        holder.setText(R.id.textView, item);
    }
}
