#This program requires the Apache Tika library. From the Spyder console, run "pip install tika".

from tika import parser

raw = parser.from_file('10k.pdf')
print(raw['content'])