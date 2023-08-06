#include <iostream>
#include <string>
#include <vector>
#include <sstream>
#include <unordered_map>
using namespace std;

void extractURLInfo(string url) {
    vector<string> tokens;
    string token;
    stringstream ss(url);
    
    while (getline(ss, token, ' ')) {
        tokens.push_back(token);
    }

    string protocol = tokens[0];
    string hostName = tokens[1];

    if (tokens.size() > 2) {
        vector<string> keyValuePairs;
        stringstream ss2(tokens[2]);

        while (getline(ss2, token, '&')) {
            keyValuePairs.push_back(token);
        }

        unordered_map<string, string> keyValueMap;
        for (string pairStr : keyValuePairs) {
            size_t found = pairStr.find('=');
            string key = pairStr.substr(0, found);
            string value = pairStr.substr(found + 1);
            keyValueMap[key] = value;
        }

        cout << protocol << " " << hostName << " ";
        for (auto it = keyValueMap.begin(); it != keyValueMap.end(); ++it) {
            cout << "[" << it->first << ": " << it->second << "]";
        }
        cout << endl;
    } else {
        cout << protocol << " " << hostName << endl;
    }
}

int main() {
    int T;
    cin >> T;

    while (T--) {
        string url;
        cin >> url;
        extractURLInfo(url);
    }

    return 0;
}
