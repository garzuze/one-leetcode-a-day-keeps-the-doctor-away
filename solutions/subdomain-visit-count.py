from typing import List


class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        d_map = {}
        result = []
        
        for d in cpdomains:
            count, domain = d.split(" ")
            sub_domains = domain.split(".")

            sub_domain = ""
            for sub in reversed(sub_domains):
                if sub_domain == "":
                    sub_domain += sub
                else:
                    sub_domain = f"{sub}.{sub_domain}"
                
                if sub_domain not in d_map:
                    d_map[sub_domain] = 0
                
                d_map[sub_domain] += int(count)
        
        for count, sub in d_map.items():
            result.append(f"{sub} {count}")
        
        return result
