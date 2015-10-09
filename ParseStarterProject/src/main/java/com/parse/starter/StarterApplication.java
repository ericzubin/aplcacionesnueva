/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.ParseUser;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Parse.initialize(this, "BR0BDh6cfKSJ7G5Mjje82Db24rBpVA5JAfgRXrKj", "OIZiCe9uSkJ0Aee8AxuPUewcHXCmKjGNqhXymOLs");
    ParseInstallation.getCurrentInstallation().saveInBackground();

  }
}
