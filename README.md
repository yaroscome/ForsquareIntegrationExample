# Forsquare Integration Example
This example shows a basic skeleton for an application that integrates with Forsquare API for venues searching.

### Usage
Typing something like "coffee" or "tea" into the search box and taping on search button will load venues results in the list below. For simplicity the application will search in London area and the number of results was limited to 18.

### Description
This example implements MVP pattern. Every user action on the View is sent to the Presenter that handles searches asynchronously using Retrofit2 library. Once results are fetched Presenter passes them back to the View and the View displays them. Note that data that is passed by API to the app is partilay deserialized.

API connection handler (called ForsquareConnector) is passed to the Presenter via SimpleInjection initialized in the global AppEnvironment class to simulate Dependecy Injection.

Every viewable part of the app, represented by activity is grouped in a feature package. This approach keeps strong tied classes toghether (MVP classes) for easier modification or removal when needed.

All activities inherit from BaseActivity. This is useful for shared behavoiurs, like (un)registering for events, environment initialization, etc.

### Future
Possible future implementations:
- suggestions for autocompleting searches
- more search details, like radius or category
- GPS tracking service

