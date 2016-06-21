package in.srain.cube.views.ptr.demo.ui.classic;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import in.srain.cube.views.ptr.PtrClassicFrameLayout;
import in.srain.cube.views.ptr.PtrDefaultHandler2;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.demo.R;
import in.srain.cube.views.ptr.demo.radapter.TestAdapter;
import in.srain.cube.views.ptr.demo.ui.wigdets.RecyclerViewHeader;

/**
 * Created by yubaokang on 16-6-21.
 */
public class RecyclerVIewTest extends Activity {
    PtrClassicFrameLayout ptrClassicFrameLayout;
    RecyclerViewHeader recyclerViewHeader;
    RecyclerView recyclerView;
    TestAdapter adapter;
    List<String> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_recyclerview);
        init();
    }

    public void init() {
        ptrClassicFrameLayout = (PtrClassicFrameLayout) findViewById(R.id.ptrClassicFrameLayout);
        recyclerViewHeader = (RecyclerViewHeader) findViewById(R.id.recyclerViewHeader);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        lists = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            lists.add("哈哈哈" + i);
        }
        adapter = new TestAdapter(recyclerView, lists, R.layout.item_test);
        recyclerViewHeader.attachTo(recyclerView);
        recyclerView.setAdapter(adapter);
        ptrClassicFrameLayout.setPtrHandler(new PtrDefaultHandler2() {

            @Override
            public void onLoadMoreBegin(PtrFrameLayout frame) {
                for (int i = 0; i < 10; i++) {
                    lists.add("新加" + i);
                }
                adapter.notifyDataSetChanged();
                ptrClassicFrameLayout.refreshComplete();
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                for (int i = 0; i < 5; i++) {
                    lists.add("刷新" + i);
                }
                adapter.notifyDataSetChanged();
                ptrClassicFrameLayout.refreshComplete();
            }

            @Override
            public boolean checkCanDoLoadMore(PtrFrameLayout frame, View content, View footer) {
                return super.checkCanDoLoadMore(frame, recyclerView, footer);
            }

            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return super.checkCanDoRefresh(frame, recyclerView, header);
            }
        });
    }
}
