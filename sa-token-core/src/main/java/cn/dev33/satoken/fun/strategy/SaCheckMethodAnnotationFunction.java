/*
 * Copyright 2020-2099 sa-token.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dev33.satoken.fun.strategy;

import java.lang.reflect.Method;
import java.util.function.Consumer;

/**
 * 函数式接口：对一个 [Method] 对象进行注解校验 （注解鉴权内部实现）
 *
 * <p>  参数：Method句柄  </p>
 * <p>  返回：无  </p>
 *
 * @author click33
 * @since 1.35.0
 */
@FunctionalInterface
public interface SaCheckMethodAnnotationFunction extends Consumer<Method> {

}