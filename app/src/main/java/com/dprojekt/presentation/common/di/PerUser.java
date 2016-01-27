package com.dprojekt.presentation.common.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * A scoping annotation to permit objects whose lifetime should
 * conform to the life of the user session
 */
@Scope
@Retention(RUNTIME)
public @interface PerUser {}
