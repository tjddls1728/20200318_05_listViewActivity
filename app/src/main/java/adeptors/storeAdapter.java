package adeptors;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

import datas.store;

public class storeAdapter extends ArrayAdapter<store> {
//    어댑터에서 종종 사용하는 변수 세가지 정의
    Context nContext; // 화면과의 연결 고리
    List<store> mList; // 뿌려줄 목록 담는 변수
    LayoutInflater inf; // xml => 객체화 시켜주는 역할 클래스

    public storeAdapter(@NonNull Context context, int resource, @NonNull List<store> objects) {
        super(context, resource, objects);

//        생성자가 실행될때 세개의 변수를 채워줌.
        nContext = context;
        mList = objects;
        inf = LayoutInflater.from(nContext);
    }
}
