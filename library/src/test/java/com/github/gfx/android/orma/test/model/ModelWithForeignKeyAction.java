/*
 * Copyright (c) 2015 FUJI Goro (gfx).
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

package com.github.gfx.android.orma.test.model;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

import androidx.annotation.Nullable;

/**
 * @see ModelWithForeignKeyAction_Schema
 */
@Table
public class ModelWithForeignKeyAction {

    @PrimaryKey
    public long id;

    @Nullable
    @Column(indexed = true, onUpdate = Column.ForeignKeyAction.NO_ACTION, onDelete = Column.ForeignKeyAction.NO_ACTION)
    public Author author1;

    @Nullable
    @Column(indexed = true, onUpdate = Column.ForeignKeyAction.SET_NULL, onDelete = Column.ForeignKeyAction.SET_DEFAULT)
    public Author author2;

    @Nullable
    @Column(indexed = true, onUpdate = Column.ForeignKeyAction.RESTRICT, onDelete = Column.ForeignKeyAction.CASCADE)
    public Author author3;
}
