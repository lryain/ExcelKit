/*
 * Copyright (c) 2018, 吴汶泽 (wuwz@live.com).
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wuwenze.poi.exception;

/**
 * @author wuwenze
 * @date 2018/5/1
 */
public class ExcelKitException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public ExcelKitException() {
    super();
  }

  public ExcelKitException(String message) {
    super(message);
  }

  public ExcelKitException(String message, Throwable cause) {
    super(message, cause);
  }
  public ExcelKitException(Throwable cause) {
    super(cause);
  }
}