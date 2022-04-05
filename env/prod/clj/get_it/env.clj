(ns get-it.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[get-it started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[get-it has shut down successfully]=-"))
   :middleware identity})
