from typing import List

class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        formatted_emails = set()

        for email in emails:
            local, domain = email.split("@")
            local = local.replace(".", "")
            local = local.split("+")[0]

            final_email = f"{local}@{domain}"
            formatted_emails.add(final_email)

        return len(formatted_emails)