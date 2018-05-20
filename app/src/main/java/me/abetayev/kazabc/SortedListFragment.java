package me.abetayev.kazabc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class SortedListFragment extends Fragment {

    @BindView(R.id.recycler) RecyclerView mRecyclerView;

    private View mRootView;
    private Unbinder mUnbinder;
    private ArrayList<Article> mArticleList = new ArrayList<>();

    public static SortedListFragment create() {
        return new SortedListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        setupSeeds();
        mRootView = inflater.inflate(R.layout.fragment_sortedlist, container, false);
        mUnbinder = ButterKnife.bind(this, mRootView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        mRecyclerView.setAdapter(new SortedListAdapter(getContext(), mArticleList));
        return mRootView;
    }

    private void setupSeeds() {
        mArticleList.add(new Article(1, R.drawable.a, R.drawable.a_img));
        mArticleList.add(new Article(2, R.drawable.a2, R.drawable.a2_img));
        mArticleList.add(new Article(3, R.drawable.b, R.drawable.b_img));
        mArticleList.add(new Article(4, R.drawable.v, R.drawable.v_img));
        mArticleList.add(new Article(5, R.drawable.g, R.drawable.g_img));
        mArticleList.add(new Article(6, R.drawable.g2, R.drawable.g2_img));
        mArticleList.add(new Article(7, R.drawable.d, R.drawable.d_img));
        mArticleList.add(new Article(8, R.drawable.e, R.drawable.e_img));
        mArticleList.add(new Article(9, R.drawable.e2, R.drawable.e2_img));
        mArticleList.add(new Article(10, R.drawable.zh, R.drawable.zh_img));
        mArticleList.add(new Article(11, R.drawable.z, R.drawable.z_img));
        mArticleList.add(new Article(12, R.drawable.i, R.drawable.i_img));
        mArticleList.add(new Article(13, R.drawable.i2, R.drawable.i2_img));
        mArticleList.add(new Article(14, R.drawable.k, R.drawable.k_img));
        mArticleList.add(new Article(15, R.drawable.k2, R.drawable.k2_img));
        mArticleList.add(new Article(16, R.drawable.l, R.drawable.l_img));
        mArticleList.add(new Article(17, R.drawable.m, R.drawable.m_img));
        mArticleList.add(new Article(18, R.drawable.n, R.drawable.n_img));
        mArticleList.add(new Article(19, R.drawable.n2, R.drawable.n2_img));
        mArticleList.add(new Article(20, R.drawable.o, R.drawable.o_img));
        mArticleList.add(new Article(21, R.drawable.o2, R.drawable.o2_img));
        mArticleList.add(new Article(22, R.drawable.p, R.drawable.p_img));
        mArticleList.add(new Article(23, R.drawable.r, R.drawable.r_img));
        mArticleList.add(new Article(24, R.drawable.s, R.drawable.s_img));
        mArticleList.add(new Article(25, R.drawable.t, R.drawable.t_img));
        mArticleList.add(new Article(26, R.drawable.u, R.drawable.u_img));
        mArticleList.add(new Article(27, R.drawable.u2, R.drawable.u2_img));
        mArticleList.add(new Article(28, R.drawable.u3, R.drawable.u3_img));
        mArticleList.add(new Article(29, R.drawable.f, R.drawable.f_img));
        mArticleList.add(new Article(30, R.drawable.h, R.drawable.h_img));
        mArticleList.add(new Article(31, R.drawable.h2, R.drawable.h2_img));
        mArticleList.add(new Article(32, R.drawable.c, R.drawable.c_img));
        mArticleList.add(new Article(33, R.drawable.ch, R.drawable.ch_img));
        mArticleList.add(new Article(34, R.drawable.sh, R.drawable.sh_img));
        mArticleList.add(new Article(35, R.drawable.sh2, R.drawable.sh2_img));
        mArticleList.add(new Article(36, R.drawable.qq, R.drawable.qq_img));
        mArticleList.add(new Article(37, R.drawable.qw, R.drawable.qw_img));
        mArticleList.add(new Article(38, R.drawable.i3, R.drawable.i3_img));
        mArticleList.add(new Article(39, R.drawable.qe, R.drawable.qe_img));
        mArticleList.add(new Article(40, R.drawable.e3, R.drawable.e3_img));
        mArticleList.add(new Article(41, R.drawable.yu, R.drawable.yu_img));
        mArticleList.add(new Article(42, R.drawable.ya, R.drawable.ya_img));
    }

    @Override public void onDestroyView() {
        mUnbinder.unbind();
        super.onDestroyView();
    }
}
