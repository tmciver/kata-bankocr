(ns bankocr-kata.core
  (:require [clojure.java.io :as io]))

(defn -main
  [path]
  (with-open [rdr (io/reader path)
              wrtr (io/writer (str path ".out"))]
    (let [account-numbers (parse rdr)]
      (doseq [account-number account-numbers]
        (.write wrtr account-number)
        (.write wrtr '\n')))))
