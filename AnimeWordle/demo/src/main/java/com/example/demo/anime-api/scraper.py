from bs4 import BeautifulSoup
from urllib.request import urlopen
import requests


url = "https://myanimelist.net/character.php"
key = "character/"
req = requests.get(url)
soup = BeautifulSoup(req.content, "html.parser")

# Use a set to store unique links
unique_links = set()

for link in soup.find_all('a'):
    href = link.get("href", "")
    if key in href:
         # Add the link to the set
        unique_links.add(href)

# Convert the set back to a list if needed
unique_links_list = list(unique_links)

# Print unique links
for unique_link in unique_links_list:
    print(unique_link)

# # Find the <a> tag with the specific class
# character_name_tag = soup.find_all('a', class_='fs14 fw-b')
# print(character_name_tag)
# # Extract and print the names
# # for tag in character_name_tag:
# #     character_name = tag.text.strip()
# #     print(character_name)

