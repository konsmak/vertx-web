/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.web.templ;

import java.util.Map;
import rx.Observable;
import io.vertx.rxjava.core.buffer.Buffer;
import io.vertx.rxjava.ext.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * A template engine that uses the FreeMarker library.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.templ.FreeMarkerTemplateEngine original} non RX-ified interface using Vert.x codegen.
 */

public class FreeMarkerTemplateEngine extends TemplateEngine {

  final io.vertx.ext.web.templ.FreeMarkerTemplateEngine delegate;

  public FreeMarkerTemplateEngine(io.vertx.ext.web.templ.FreeMarkerTemplateEngine delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Create a template engine using defaults
   * @return the engine
   */
  public static FreeMarkerTemplateEngine create() { 
    FreeMarkerTemplateEngine ret = FreeMarkerTemplateEngine.newInstance(io.vertx.ext.web.templ.FreeMarkerTemplateEngine.create());
    return ret;
  }

  /**
   * Set the extension for the engine
   * @param extension the extension
   * @return a reference to this for fluency
   */
  public FreeMarkerTemplateEngine setExtension(String extension) { 
    FreeMarkerTemplateEngine ret = FreeMarkerTemplateEngine.newInstance(delegate.setExtension(extension));
    return ret;
  }

  /**
   * Set the max cache size for the engine
   * @param maxCacheSize the maxCacheSize
   * @return a reference to this for fluency
   */
  public FreeMarkerTemplateEngine setMaxCacheSize(int maxCacheSize) { 
    FreeMarkerTemplateEngine ret = FreeMarkerTemplateEngine.newInstance(delegate.setMaxCacheSize(maxCacheSize));
    return ret;
  }


  public static FreeMarkerTemplateEngine newInstance(io.vertx.ext.web.templ.FreeMarkerTemplateEngine arg) {
    return arg != null ? new FreeMarkerTemplateEngine(arg) : null;
  }
}