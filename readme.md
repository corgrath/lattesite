# LatteSite

LatteSite is an SEO (Search Engine Optimization) focused,
lightweight SSG (Static Site Generator) framework that 
using OOP (Object-Oriented Programming) principles, written in Java.



# Why does this project exist

In order to create a highly SEO focused, blazing fast, static websites using a single language as much as possible.

# This project is very young

This is a newly created project, so it lacks a lot of structure and ways of working.

These can be defined and established if the project grows in popularity.


# Principles

 - It should be a lightweight framework that can be extended with custom implementation
 - Keep the code simple with POJO (Plain Old Java Objects)
 - Object Oriented Programming style
 - A single exported JAR artifact
 

# Architecture overview

The framework consists of these main pillars:


- LatteSite site

  If you want a more handheld 


- HTML Elements & Custom Composite Components 

  There should be a POJO for each common [HTML element](https://developer.mozilla.org/en-US/docs/Web/HTML/Element).

  You should be able to create your own library of custom composite components.

- HTML generator

  There is a default HTML generator included that you can use, extend or create your own

- Pages and Page Generator

  There is a concept of a standard HTML Page that you can use, extend, or create your own

  There is also a default Page HTML generator included that you can use, extend or create your own

- Sitemap Generator

  There is also a default sitemap.xml generator included that you can use



# What about CSS and JavaScript?

This project has no official way to generate this at the current
(but it has the goal to include a CSS and JavaScript framework)

This means that for the time being you can use whatever CSS framework you want.

In the current examples, Node.JS LESS is used for CSS, and TypeScript+Browserify is used for any front-end implementation.





# Documentation / Getting started

TBW



# Releases & Distribution 

- This project may generate a new JAR artifact release at any time, meaning there are no defined milestones.
- You can find all releases in the `/distribution/` folder
- Versioning is based on [Date of Release](https://en.wikipedia.org/wiki/Software_versioning#Date_of_release)
  using the [ISO8601 Date Format](https://en.wikipedia.org/wiki/ISO_8601), for example `lattesite-20250101`


# Development

The project owner controls the development of the project, including adding/rejecting contributions.

There are no defined commit message conventions at this time.


# Project Owner

Christoffer (github.com/corgrath)


# License - Apache 2.0 with No Competing Framework Clause

Goal:

You should be able to use, fork, improve and contribute with changes, but you should not be allowed to
repackage it nor redistribute it as a (commercial) competing framework.

If you like the project, contribute to the main project. 

TLDR version:

 - Open-source under Apache 2.0 – You can use, modify, and distribute it.
 - Commercial use allowed – You can use it in your business or products.
 - Contributions are owned by the project – All contributions are assigned to the project owner.
 - No competing products – You can’t fork it to create or promote a competing framework or service.
 - No rebranding – Public forks or derivatives must retain the original project name and attribution.
