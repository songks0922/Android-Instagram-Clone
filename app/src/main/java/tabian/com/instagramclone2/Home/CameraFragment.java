package tabian.com.instagramclone2.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tabian.com.instagramclone2.R;
import tabian.com.instagramclone2.recyclercard.FoodCard;
import tabian.com.instagramclone2.recyclercard.FoodCardAdapter;

/**
 * Created by User on 5/28/2017.
 */

public class CameraFragment extends Fragment {
    private static final String TAG = "CameraFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_camera, container, false);
//        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//
//        FoodCardAdapter adapter = new FoodCardAdapter();
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//        adapter.addItem(new FoodCard("가게 샘플1", "컨텐츠 샘플입니다1", "샘플 태그1", ""));
//        adapter.addItem(new FoodCard("가게 샘플2", "컨텐츠 샘플입니다2", "샘플 태그２", ""));
//        adapter.addItem(new FoodCard("가게 샘플3", "컨텐츠 샘플입니다3", "샘플 태그3", ""));
//        adapter.addItem(new FoodCard("가게 샘플4", "컨텐츠 샘플입니다4", "샘플 태그4", ""));

//        recyclerView.setAdapter(adapter);
        return view;
    }
}
