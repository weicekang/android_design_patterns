// Generated code from Butter Knife. Do not modify!
package com.example.jingbin.designpattern.prototype;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.jingbin.designpattern.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProtoTypeActivity_ViewBinding implements Unbinder {
  private ProtoTypeActivity target;

  private View view2131165286;

  @UiThread
  public ProtoTypeActivity_ViewBinding(ProtoTypeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProtoTypeActivity_ViewBinding(final ProtoTypeActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_prototype, "method 'onViewClicked'");
    view2131165286 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165286.setOnClickListener(null);
    view2131165286 = null;
  }
}
