package io.github.takusan23.materialyousample

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.color.DynamicColors

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // 動的テーマを適用したContext
        val context = DynamicColors.wrapContextIfAvailable(requireContext())
        // 動的テーマを適用したContextを使ったLayoutInflaterを生成
        val dynamicColorApplyLayoutInflater = LayoutInflater.from(context)
        return dynamicColorApplyLayoutInflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}