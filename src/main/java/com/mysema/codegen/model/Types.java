/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.codegen.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/**
 * @author tiwe
 *
 */
public final class Types {

    public static final ClassType OBJECT = new ClassType(TypeCategory.SIMPLE, Object.class);

    public static final ClassType OBJECTS = new ClassType(TypeCategory.ARRAY, Object[].class);

    public static final ClassType BIG_DECIMAL = new ClassType(TypeCategory.NUMERIC, BigDecimal.class);

    public static final ClassType BIG_INTEGER = new ClassType(TypeCategory.NUMERIC, BigInteger.class);

    public static final ClassType BOOLEAN = new ClassType(TypeCategory.BOOLEAN, Boolean.class, boolean.class);

    public static final ClassType BOOLEAN_P = new ClassType(TypeCategory.BOOLEAN, boolean.class);

    public static final ClassType BYTE = new ClassType(TypeCategory.NUMERIC, Byte.class, byte.class);

    public static final ClassType BYTE_P = new ClassType(TypeCategory.NUMERIC, byte.class);

    public static final ClassType CHARACTER = new ClassType(TypeCategory.COMPARABLE, Character.class, char.class);

    public static final ClassType CHAR = new ClassType(TypeCategory.COMPARABLE, char.class);

    public static final ClassType COLLECTION = new ClassType(TypeCategory.COLLECTION, Collection.class, OBJECT);

    public static final ClassType DOUBLE = new ClassType(TypeCategory.NUMERIC, Double.class, double.class);

    public static final ClassType DOUBLE_P = new ClassType(TypeCategory.NUMERIC, double.class);

    public static final ClassType FLOAT = new ClassType(TypeCategory.NUMERIC, Float.class, float.class);

    public static final ClassType FLOAT_P = new ClassType(TypeCategory.NUMERIC, float.class);

    public static final ClassType INTEGER = new ClassType(TypeCategory.NUMERIC, Integer.class, int.class);

    public static final ClassType INT = new ClassType(TypeCategory.NUMERIC, int.class);

    public static final ClassType ITERABLE = new ClassType(TypeCategory.SIMPLE, Iterable.class, OBJECT);

    public static final ClassType LIST = new ClassType(TypeCategory.LIST, List.class, OBJECT);

    public static final ClassType LOCALE = new ClassType(TypeCategory.SIMPLE, Locale.class);

    public static final ClassType LONG = new ClassType(TypeCategory.NUMERIC, Long.class, long.class);

    public static final ClassType LONG_P = new ClassType(TypeCategory.NUMERIC, long.class);

    public static final ClassType MAP = new ClassType(TypeCategory.MAP, Map.class, OBJECT, OBJECT);

    public static final ClassType SET = new ClassType(TypeCategory.SET, Set.class, OBJECT);

    public static final ClassType SHORT = new ClassType(TypeCategory.NUMERIC, Short.class, short.class);

    public static final ClassType SHORT_P = new ClassType(TypeCategory.NUMERIC, short.class);

    public static final ClassType STRING = new ClassType(TypeCategory.STRING, String.class);

    public static final ClassType URI = new ClassType(TypeCategory.COMPARABLE, URI.class);

    public static final ClassType VOID = new ClassType(TypeCategory.SIMPLE, void.class);

    public static final SimpleType DATE_TIME = new SimpleType(TypeCategory.DATETIME, "org.joda.time.DateTime", "org.joda.time", "DateTime", false, false);

    public static final SimpleType LOCAL_DATE = new SimpleType(TypeCategory.DATE, "org.joda.time.LocalDate", "org.joda.time", "LocalDate", false, false);

    public static final SimpleType LOCAL_TIME = new SimpleType(TypeCategory.TIME, "org.joda.time.LocalTime", "org.joda.time", "LocalTime", false, false);

    private Types(){}

}
