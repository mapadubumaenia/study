#정규표현식 2: 응용

import re

text="13-32-14"

if re.search(r"^(\d{2})-(\d{2})-(\d{2})$",text):
    print("있음")