# Frequently Asked Questions

Frequent questions that are asked by RODA users and their answers.

**Have a question that is not here?** [Create an issue](https://github.com/keeps/roda/issues/new) and mark it with a "question" label.


***

**Question: How to add a new language to the system?**

Complete instructions on how to add a new language to the system are available at: https://github.com/keeps/roda/wiki/RODA-i18n-guidelines

***

**Question: How to set up the development environment for RODA?**

Complete instructions on how to set up the development environment are available at: https://github.com/keeps/roda/wiki/Developer-guide#wiki-dev-env

***

**Question: How does the Preservation process work? How often does it work? How can it be configured? How can it be tested?**

The preservation process can work in two different ways:

1. Statically defined format migration policy
2. Risk monitoring, case-by-case preservation planning and action execution

**Statically defined format migration policy**

For each input format, a format conversion service can be defined that migrates the input format to a preservation format during the ingest process. We call this sub-process Normalization, and is a defined step on the ingest workflow. The file [normalization.properties](https://github.com/keeps/roda/blob/master/roda-installer/src/main/resources/files/core/config/plugins/normalization.properties) allows the definition of the services that migrate the format on ingest. This file can be edited on RODA config/plugins folder after install.

Also, format conversion for access can be configured on RODA-WUI, so access formats can be generated as they are needed. These just in time file format conversions are called Disseminators and can be configured in the [roda-wui.properties](https://github.com/keeps/roda/blob/master/roda-installer/src/main/resources/files/ui/config/templates/roda-wui.properties) file, available on RODA config folder after install.

**Risk monitoring, case-by-case preservation planning and action execution**

A more advanced preservation process is currently being developed in RODA on the [SCAPE project](http://www.scape-project.eu). This process uses a tool called [Scout](http://openplanets.github.io/scout/) to monitor RODA content and events, i.e. monitor the evolution of file format distribution and all other characteristics of content, and also repository events like ingest, access and preservation actions execution. Also, Scout monitors many properties of the world, like file format registries, tool catalogues and web archives, allowing the discovery of preservation risks. After discovering a preservation risk, the preservation planning tool [Plato](http://www.ifs.tuwien.ac.at/dp/plato) supports the decision making process, allowing to systematically and easily find the best alternative to mitigate the problem and producing a well-documented and actionable preservation plan. Finally, RODA allows execution of the preservation plan, and sending quality assurance information back to Scout, which will detect the problem solved, and start again monitoring for problems.

For more information about the SCAPE Planning and Watch suite and its development in RODA, please check the following presentation:

http://www.slideshare.net/lfaria83/or2013-pw-lifecycle
 
