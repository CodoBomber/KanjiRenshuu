#!/bin/bash

sudo apt-get install git
cd ~/
git clone https://github.com/CodoBomber/KanjiRenshuu.git
cd KanjiRenshuu
java -Dfile.encoding=UTF-8 -jar $1