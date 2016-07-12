package adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import bean.ItemBean;

/**
 * Created by YF on 2016/7/12.
 */
public class SlideAdapter extends RecyclerView.Adapter{

    public static final int NORMAL = 1000;
    public static final int SLIDE = 2000;

    private int mState = NORMAL;
    private List<ItemBean> mItemBeans;


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
