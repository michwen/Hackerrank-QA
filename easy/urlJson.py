# Goal print json using python 2

import urllib2, json

def countriesPy2(str,p):

	urlFile = urllib2.urlopen("https://jsonmock.hackerrank.com/api/countries/search?name=" +str)

	resp_dict = json.loads(urlFile) 

# Goal print out the population size exclusively for all the corresponding countries with the given substring in the website address using python 3
# Goal print an integer denoting the total number of countries have population > p with the given substring in the website address using python 3

import requests

def countriesPy3(str, p):
    r = requests.get("https://jsonmock.hackerrank.com/api/countries/search?name=" + str)

    count = 0

    for criteria in r.json()['data']:
        for key, value in criteria.iteritems():
            if ((key == "population") and value > p):
                print criteria['name'], key, 'is:', value
                count = count + 1

    return count

#print(countriesPy3("un", 100000))
