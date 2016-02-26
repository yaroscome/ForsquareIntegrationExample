# Forsquare Integration Example

This example shows very simple skeleton for an application that uses Forsquare API for venues search. 

### Usage
Typing nouns like "coffee" or "tea" in the search box and taping on search icon will load venues results in the list below. For simplicity results are limited to 18 and to London area. 

### Description
This example is built with MVP pattern in mind. Every user action on the View is sent to the Presenter that handles searches asynchronously with Retrofit2 library. After results are fetched Presenter passes them back to the View and the View displays them. Only part of the data tha API passes to the app is deserialized. 

API connection handle (here called ForsquareConnector) is passed to the presenter via SimpleInjection initialized in the global AppEnvironment class to simulate Dependecy Injection. 

Every viewable part of the app, represented by activity is grouped in a feature package. This approach keeps strong tied classes toghether (MVP classes) for easier modification or elimination when needed.

All activities inherit from BaseActivity. This is useful for shared behavoiurs, like (un)registering for events, environment initialization, etc.

### Future
Possible future implementations:
- suggestions for autocompleting searches
- showing details for searches
- GPS tracking service

