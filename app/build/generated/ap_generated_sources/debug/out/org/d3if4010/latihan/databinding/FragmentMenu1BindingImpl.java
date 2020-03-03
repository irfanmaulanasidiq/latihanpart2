package org.d3if4010.latihan.databinding;
import org.d3if4010.latihan.R;
import org.d3if4010.latihan.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMenu1BindingImpl extends FragmentMenu1Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_pemesananMakanan, 1);
        sViewsWithIds.put(R.id.tv_kue, 2);
        sViewsWithIds.put(R.id.bt_kurang, 3);
        sViewsWithIds.put(R.id.tv_nilai, 4);
        sViewsWithIds.put(R.id.bt_tambah, 5);
        sViewsWithIds.put(R.id.tv_pilihTopping, 6);
        sViewsWithIds.put(R.id.radioGroup, 7);
        sViewsWithIds.put(R.id.rb_coklat, 8);
        sViewsWithIds.put(R.id.rb_strawberry, 9);
        sViewsWithIds.put(R.id.cb_iceCream, 10);
        sViewsWithIds.put(R.id.cb_Ceres, 11);
        sViewsWithIds.put(R.id.tv_pilihRasa, 12);
        sViewsWithIds.put(R.id.edit_nama, 13);
        sViewsWithIds.put(R.id.b_beli, 14);
        sViewsWithIds.put(R.id.b_reset, 15);
        sViewsWithIds.put(R.id.tv_struk, 16);
        sViewsWithIds.put(R.id.tv_nama, 17);
        sViewsWithIds.put(R.id.tv_rasa, 18);
        sViewsWithIds.put(R.id.tv_totalHarga, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMenu1BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentMenu1BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[5]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.EditText) bindings[13]
            , (android.widget.RadioGroup) bindings[7]
            , (android.widget.RadioButton) bindings[8]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}