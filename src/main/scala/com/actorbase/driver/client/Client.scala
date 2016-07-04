/**
  * The MIT License (MIT)
  * <p/>
  * Copyright (c) 2016 ScalateKids
  * <p/>
  * Permission is hereby granted, free of charge, to any person obtaining a copy
  * of this software and associated documentation files (the "Software"), to deal
  * in the Software without restriction, including without limitation the rights
  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  * copies of the Software, and to permit persons to whom the Software is
  * furnished to do so, subject to the following conditions:
  * <p/>
  * The above copyright notice and this permission notice shall be included in all
  * copies or substantial portions of the Software.
  * <p/>
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  * SOFTWARE.
  * <p/>
  * @author Scalatekids 
  * @version 1.0
  * @since 1.0
  */

package com.actorbase.driver.client

import scalaj.http.HttpOptions

import com.actorbase.driver.client.api.RestMethods._

/**
  * Trait to define the behavior of a client designed to interface with
  * the server side of the system Actorbase
  *
  */
trait Client {

  /**
    * Add connection options to the scalaj-http client Object
    *
    */
  def createClientOptions: Seq[HttpOptions.HttpOption]

  /**
    * Send method, send a Request object to the Actorbase server listening
    * and return a Response object
    *
    * @param request a Request reference, contains all HTTP request details
    * @return an object of type Response, containing the status of the response
    * and the body as Option[String]
    */
  def send(request: Request): Response

}
