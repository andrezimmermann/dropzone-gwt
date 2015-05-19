dropzone-gwt
============

This is a dropzone.js GWT wrapper, somewhat usable.

---

## What?

This bundles [Dropzone.js](http://www.dropzonejs.com/) into a small GWT lib, injecting it's Javascript and CSS files during runtime and wrapping the JSNI calls to the Dropzone.js code, convenitenly exposing the API as a GWT Widget.

##How?

Instantiate a `com.github.andrezimmermann.dropzone.client.Dropzone` widget, and add to a `Container`, see the magic happen.

[![Build Status](https://travis-ci.org/andrezimmermann/dropzone-gwt.svg?branch=master)](https://travis-ci.org/andrezimmermann/dropzone-gwt)
