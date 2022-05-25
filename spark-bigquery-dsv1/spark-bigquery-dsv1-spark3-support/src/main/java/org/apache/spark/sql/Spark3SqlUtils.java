/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.spark.sql;

import org.apache.spark.sql.types.StructType;
import scala.collection.Seq;
import org.apache.spark.sql.catalyst.expressions.AttributeReference;

public class Spark3SqlUtils {

    private Spark3SqlUtils() {}

    // `toAttributes` is protected[sql] starting spark 3.2.0, so we need this call to be in the same package
    public static Seq<AttributeReference> toAttributes(StructType schema) {
        return schema.toAttributes();
    }
}
