// Generated by view binder compiler. Do not edit!
package mariana.lzry.finanzas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mariana.lzry.finanzas.R;

public final class HomeFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final TextView textViewTotalIncome;

  @NonNull
  public final TextView textViewTotalOutcome;

  private HomeFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull Guideline guideline3,
      @NonNull TextView textViewTotalIncome, @NonNull TextView textViewTotalOutcome) {
    this.rootView = rootView;
    this.guideline3 = guideline3;
    this.textViewTotalIncome = textViewTotalIncome;
    this.textViewTotalOutcome = textViewTotalOutcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.home_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline3;
      Guideline guideline3 = ViewBindings.findChildViewById(rootView, id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.textView_total_income;
      TextView textViewTotalIncome = ViewBindings.findChildViewById(rootView, id);
      if (textViewTotalIncome == null) {
        break missingId;
      }

      id = R.id.textView_total_outcome;
      TextView textViewTotalOutcome = ViewBindings.findChildViewById(rootView, id);
      if (textViewTotalOutcome == null) {
        break missingId;
      }

      return new HomeFragmentBinding((ConstraintLayout) rootView, guideline3, textViewTotalIncome,
          textViewTotalOutcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}