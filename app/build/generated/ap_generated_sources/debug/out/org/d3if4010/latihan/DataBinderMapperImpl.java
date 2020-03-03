package org.d3if4010.latihan;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.d3if4010.latihan.databinding.ActivityMainBindingImpl;
import org.d3if4010.latihan.databinding.FragmentMainBindingImpl;
import org.d3if4010.latihan.databinding.FragmentMenu1BindingImpl;
import org.d3if4010.latihan.databinding.FragmentMenu2BindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTMAIN = 2;

  private static final int LAYOUT_FRAGMENTMENU1 = 3;

  private static final int LAYOUT_FRAGMENTMENU2 = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.d3if4010.latihan.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.d3if4010.latihan.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.d3if4010.latihan.R.layout.fragment_menu1, LAYOUT_FRAGMENTMENU1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.d3if4010.latihan.R.layout.fragment_menu2, LAYOUT_FRAGMENTMENU2);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENU1: {
          if ("layout/fragment_menu1_0".equals(tag)) {
            return new FragmentMenu1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENU2: {
          if ("layout/fragment_menu2_0".equals(tag)) {
            return new FragmentMenu2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu2 is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", org.d3if4010.latihan.R.layout.activity_main);
      sKeys.put("layout/fragment_main_0", org.d3if4010.latihan.R.layout.fragment_main);
      sKeys.put("layout/fragment_menu1_0", org.d3if4010.latihan.R.layout.fragment_menu1);
      sKeys.put("layout/fragment_menu2_0", org.d3if4010.latihan.R.layout.fragment_menu2);
    }
  }
}
