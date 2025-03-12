# LatteSite - a SSG (Static Site Generator) framework in Java

LatteSite is an [SEO (Search Engine Optimization)](https://en.wikipedia.org/wiki/Search_engine_optimization) focused,
lightweight [SSG (Static Site Generator)](https://en.wikipedia.org/wiki/Static_site_generator) framework that 
uses [OOP (Object-Oriented Programming)](https://en.wikipedia.org/wiki/Object-oriented_programming) principles,
written in [Java](https://en.wikipedia.org/wiki/Java_(programming_language)).



## Why this project got created

I got tired of using multiple frameworks and languages just to create a blazing fast static website that
should achieve 100% [Google Lighthouse](https://en.wikipedia.org/wiki/Lighthouse_(software)) scores.

So I started to create my own SSG using the most popular and versatile backend language I knew; Java.



## Site generation features

 - Generate HTML based on POJO
 - Sitemap generator
 - Structured Data
 - Maintains a public/ and static/ folder structure
 - Localization support



## This project is very young

This is a newly created project, so it lacks a lot of common features, as well as a structure and ways of working.

However, these can be defined and established if the project grows in popularity.



## Principles

 - Lightweight framework with not a lot of moving parts
 - SOLID
 - Keep the code simple with POJO (Plain Old Java Objects)
 - Object Oriented Programming style
 - Beans, services, and utils using Dependency Injection patterns
 - A single exported JAR artifact
 

## Architectural overview

The framework currently consists of these main features:

- HTML Elements & Custom Composite Components 

  There should be a POJO for each common [HTML element](https://developer.mozilla.org/en-US/docs/Web/HTML/Element).

  You should be able to create your own library of custom composite components.

- HTML generator

  There is a default HTML generator included that you can use, extend or create your own

- Sitemap Generator

  There is also a default sitemap.xml generator included that you can use

- Pages and Page Generator (NOT YET ADDED)

  There is a concept of a standard HTML Page that you can use, extend, or create your own

  There is also a default Page HTML generator included that you can use, extend or create your own

- i18n Localization

  It can handle a website using multiple locales



## Source code examples

 - [online-christoffer-www](https://github.com/corgrath/online-christoffer-www/blob/master/src/online/christoffer/www/Main.java)



## Join the development (Discord Server)

- There is a very basic Discord server here you can join: https://discord.gg/tmcydvJdrq



## What about CSS and JavaScript?

At the current time, there is no official way to attach CSS or JavaScript.

This means that for the time being you can use whatever frameworks you want.



## Getting started

 - TBA



## Releases & Distribution 

- This project may generate a new JAR artifact release at any time, meaning there are no defined milestones.
- You can find all releases in the `/releases/` folder
- Versioning is based on [Date of Release](https://en.wikipedia.org/wiki/Software_versioning#Date_of_release)
  using the [ISO8601 Date Format](https://en.wikipedia.org/wiki/ISO_8601), for example `lattesite-20250101`



## Development process

The project owner controls the development of the project, including adding/rejecting contributions.

There are no defined commit message conventions at this time.



## Project Owner

 - Christoffer (github.com/corgrath)



## License - Apache 2.0 with No Competing Framework Clause

You should be able to use, fork, improve and contribute with changes, but you should not be allowed to
repackage it nor redistribute it as a (commercial) competing framework.

If you like the project, contribute to the main project. 

TLDR version:

 - Open-source under Apache 2.0 – You can use, modify, and distribute it.
 - Commercial use allowed – You can use it in your business or products.
 - Contributions are owned by the project – All contributions are assigned to the project owner.
 - No competing products – You can’t fork it to create or promote a competing framework or service.
 - No rebranding – Public forks or derivatives must retain the original project name and attribution.
