package com.ankitsapplication.app.modules.incomingcallnotification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityIncomingCallNotificationBinding
import com.ankitsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification1RowModel
import com.ankitsapplication.app.modules.incomingcallnotification.`data`.model.IncomingCallNotification2RowModel
import com.ankitsapplication.app.modules.incomingcallnotification.`data`.viewmodel.IncomingCallNotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class IncomingCallNotificationActivity :
    BaseActivity<ActivityIncomingCallNotificationBinding>(R.layout.activity_incoming_call_notification)
    {
  private val viewModel: IncomingCallNotificationVM by viewModels<IncomingCallNotificationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras
    val recyclerGroup187Adapter =
    RecyclerGroup187Adapter(viewModel.recyclerGroup187List.value?:mutableListOf())
    binding.recyclerGroup187.adapter = recyclerGroup187Adapter
    recyclerGroup187Adapter.setOnItemClickListener(
    object : RecyclerGroup187Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification1RowModel) {
        onClickRecyclerGroup187(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup187List.observe(this) {
      recyclerGroup187Adapter.updateData(it)
    }
    val recyclerGroup188Adapter =
    RecyclerGroup188Adapter(viewModel.recyclerGroup188List.value?:mutableListOf())
    binding.recyclerGroup188.adapter = recyclerGroup188Adapter
    recyclerGroup188Adapter.setOnItemClickListener(
    object : RecyclerGroup188Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      IncomingCallNotification2RowModel) {
        onClickRecyclerGroup188(view, position, item)
      }
    }
    )
    viewModel.recyclerGroup188List.observe(this) {
      recyclerGroup188Adapter.updateData(it)
    }
    binding.incomingCallNotificationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerGroup187(
    view: View,
    position: Int,
    item: IncomingCallNotification1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public fun onClickRecyclerGroup188(
    view: View,
    position: Int,
    item: IncomingCallNotification2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INCOMING_CALL_NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IncomingCallNotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
