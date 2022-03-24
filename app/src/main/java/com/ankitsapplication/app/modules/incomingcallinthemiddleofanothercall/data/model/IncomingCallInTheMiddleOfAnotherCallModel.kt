package com.ankitsapplication.app.modules.incomingcallinthemiddleofanothercall.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

public data class IncomingCallInTheMiddleOfAnotherCallModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtGroupCall: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_group_call)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTelegramVoice: String? =
      MyApp.getInstance().resources.getString(R.string.msg_telegram_voice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt001: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_01)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmmettBrown: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_emmett_brown)

)
